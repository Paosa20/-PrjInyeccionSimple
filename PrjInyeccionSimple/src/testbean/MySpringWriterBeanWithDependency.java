package testbean;

import Writer.IWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MySpringWriterBeanWithDependency {

    private IWriter writer;

    @Autowired
    public void setWriter(IWriter pwriter){
        this.writer = pwriter;
    }

    public void run(){
        String s = "Sample string";

        writer.writer(s);
    }
}
