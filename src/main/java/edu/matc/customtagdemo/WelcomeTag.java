package edu.matc.customtagdemo;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

//This method provides a template for emails (greetings) based on time of day.
public class WelcomeTag extends SimpleTagSupport {
   String greeting;

    @Override
    public void doTag() throws JspException, IOException {
        super.doTag();
        JspWriter out = getJspContext().getOut();
        greetUser();
        out.print(greeting);

    }



    public void greetUser() {
        LocalTime localTime = LocalTime.now();
        int currentHour = localTime.getHour();

        // Greet user 8-12
        if (currentHour >= 7 && currentHour < 12) {
            greeting = "Goodmorning";

        }
        if (currentHour == 12) {
            greeting = "Time for lunch. Clock Out.";

        }
        if (currentHour > 12 && currentHour < 11) {
            greeting = "Good evening.";

        }
        if (currentHour == 11) {
            //LocalDateTime sevenDaysFromNow =LocalDateTime.now().plusDays(7);
            LocalDateTime fiveYearsFromNow =LocalDateTime.now().plusYears(5);
            greeting = "Goodnight. Five years from now is " + fiveYearsFromNow + ". Dream big.";
        }

    }
}
