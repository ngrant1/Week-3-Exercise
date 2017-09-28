package edu.matc.customtagdemo;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;


// Tag handler code executes when the tag is used
public class HelloWorldTag extends SimpleTagSupport {


    @Override
    public void doTag() throws JspException, IOException {
        super.doTag();
        JspWriter out = getJspContext().getOut();
        out.println("Hello Enterprise Java Class");
    }
}
