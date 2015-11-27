/**
 * Created by brandon on 15-11-27.
 * factory pattern
 * */

interface Sender {
    open fun Send()
}

class SmsSender : Sender {
    override fun Send() {
        println("this is sms sender!")
    }

}

class MailSender : Sender {
    override fun Send() {
        println("this is mail sender!")
    }
}
public class SendFactory {
    fun produce(type: String): Sender? {
        when (type) {
            "mail" -> return MailSender()
            "sms" -> return SmsSender()
            else -> System.out.println("please input right type!")
        }
        return null
    }
}