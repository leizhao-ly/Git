import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

public class Test {
    private BeanFactory factory=new ClassPathXmlApplicationContext("ApplicationContext.xml");
    @org.junit.Test
    public void sendEmail() throws MessagingException {
        JavaMailSender sender=(JavaMailSender) factory.getBean("mailSender");
        //1.利用 这个sender创建一个邮件对象
        MimeMessage message= sender.createMimeMessage();
        //2.发送这个邮件 找别人来帮忙
        MimeMessageHelper helper=new MimeMessageHelper(message);
        //设置发送地址
        helper.setFrom("591400673@qq.com");
        //设置收件人地址
        helper.setTo("591400673@qq.com");
        helper.setSubject("这是我尝试发送的");
        helper.setText("这是基于Spring的新内容");
        //发送消息
        sender.send(message);
        System.out.println("发送成功");
    }
}
