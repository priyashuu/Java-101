import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SendEmail")
public class SendEmailServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        // Read parameters from the HTTP request
        String recipient = request.getParameter("recipient");
        String subject = request.getParameter("subject");
        String messageText = request.getParameter("message");

        // Set the email sender credentials
        final String senderEmail = "youremail@example.com"; // Replace with your email
        final String senderPassword = "yourpassword";       // Replace with your email password

        // SMTP server settings
        String host = "smtp.gmail.com"; // Using Gmail SMTP server
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "587");

        // Create a session with authentication
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(senderEmail, senderPassword);
            }
        });

        try {
            // Create the email message
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(senderEmail));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
            message.setSubject(subject);
            message.setText(messageText);

            // Send the email
            Transport.send(message);

            // Return success response
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<h3>Email Sent Successfully!</h3>");
        } catch (MessagingException e) {
            throw new ServletException("Error while sending email", e);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Send Email</h2>");
        out.println("<form method='post' action='SendEmail'>");
        out.println("Recipient: <input type='email' name='recipient'><br>");
        out.println("Subject: <input type='text' name='subject'><br>");
        out.println("Message: <textarea name='message'></textarea><br>");
        out.println("<input type='submit' value='Send Email'>");
        out.println("</form>");
        out.println("</body></html>");
    }
}
