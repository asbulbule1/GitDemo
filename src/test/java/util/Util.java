package util;

import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class Util
{
	public static String getExecutionProperty(String key)
	{
		Properties prop = null;
		try
		{
			FileReader reader=new FileReader("src/test/resources/execution.properties");

			prop = new Properties();
			prop.load(reader);
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}

	     return prop.getProperty(key);
	}

	public String milliSecondToHMS(long milliseconds)
	{
		long s = (milliseconds*1000) % 60;

	    long m = ((milliseconds*1000) / 60) % 60;

	    long h = ((milliseconds*1000) / (60 * 60)) % 24;

	    return String.format("%d H %02d M %02d S", h,m,s);
	}

	/**
	 * The sendReportEmail report method sends current execution report generated using
	 * ExtentReport library.
	 *
	 * <p>
	 * This method uses Office 365 smtp credentials. Current authentication username
	 * is used from Girish Bauskar. <br><b>[This user and this note needs to be removed when
	 * separate email user is created and code is updated with same.]</b>
	 *
	 * @param reportName This report name is auto generated at the start of execution
	 *
	 * @return Void
	 */
	public void sendReportEmail(FileDataSource fds, String reportName, String email_to) throws MessagingException
	{
		try
		{
			final String username = "girish.bauskar@infogen-labs.com";
			final String password = "Infogen@123";

			Properties prop = new Properties();
			prop.put("mail.smtp.host", "smtp.office365.com");
			prop.put("mail.smtp.port", "587");
			prop.put("mail.smtp.auth", true);
			prop.put("mail.smtp.starttls.enable", true); // TLS

			Session session = Session.getInstance(prop, new javax.mail.Authenticator()
			{
				@Override
				protected PasswordAuthentication getPasswordAuthentication()
				{
					return new PasswordAuthentication(username, password);
				}
			});

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(username));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email_to));
			message.setSubject("Infogen Lab Test Automation Report");
			//message.setText("Dear Mail Crawler," + "\n\n Please do not spam my email!");

			MimeBodyPart messageBodyPart1 = new MimeBodyPart();
			messageBodyPart1.setText("Hi, \n\nAttached is latest Infogen Test Automation Execution Report "
					+ "\n\nThank You!\nInfogen QA Team \n\n\n\n**This is an automated email, plese do not reply.**");

			MimeBodyPart messageBodyPart2 = new MimeBodyPart();
			DataSource source = fds;
			messageBodyPart2.setDataHandler(new DataHandler(source));
			messageBodyPart2.setFileName(reportName);

			Multipart multipart = new MimeMultipart();
			multipart.addBodyPart(messageBodyPart1);
			multipart.addBodyPart(messageBodyPart2);

			message.setContent(multipart);

			Transport.send(message);

			System.out.println("Report Email Sent");
		}
		catch(Exception e)
		{
			System.out.println("Sending report email failed!");
			e.printStackTrace();
		}
	}
		public long getDateDiff_InMinutes(String start_date, String end_date) throws java.text.ParseException
		{
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyy");

			Date d1 = sdf.parse(start_date);
			Date d2 = sdf.parse(end_date);
			long difference_milliseconds = d2.getTime() - d1.getTime();
			long days=(TimeUnit.MILLISECONDS.toMinutes(difference_milliseconds))/1440;

			return days;

		}

	}

