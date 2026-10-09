```java
import java.awt.*;
import java.applet.*;

 /*
<applet code="insertdemo" width=400 height=200>
</applet>
*/

public class insertdemo extends Applet {
    public void init() {
        setBackground(Color.cyan);
        setLayout(new BorderLayout());

        add(new Button("this is cross the top"), BorderLayout.NORTH);
        add(new Button("the footer messsage might go here"), BorderLayout.SOUTH);
        add(new Button("RIGHT"), BorderLayout.EAST);
        add(new Button("LEFT"), BorderLayout.WEST);

        String msg = "the reasonable man adapts\n\n";
        add(new TextArea(msg), BorderLayout.CENTER);
    }

    public Insets getInsets() {
        return new Insets(10, 10, 10, 10);
    }
}
```
