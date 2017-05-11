package demo

import grails.plugins.mail.MailService
import groovy.transform.CompileStatic

@CompileStatic
class Helper {

    void sendMail(MailService mailService) {
        mailService.sendMail {}
    }
}
