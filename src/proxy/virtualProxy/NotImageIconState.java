package proxy.virtualProxy;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Method;
import java.net.URL;

public class NotImageIconState implements Icon {

    ImageProxyByStatePattern imageProxy;


    URL imageURL;
    Thread retrievalThread;
    boolean retrieval = false;

    public NotImageIconState(ImageProxyByStatePattern imageProxy, URL imageURL) {
        this.imageProxy = imageProxy;
        this.imageURL = imageURL;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.drawString("正在加载图片，请等待。。。", x + 300, y + 600);
        if(!retrieval){
            retrievalThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    ImageIcon imageIcon = new ImageIcon(imageURL,"图片");
                    c.repaint();
                    imageProxy.setImageIcon(imageIcon);
                    imageProxy.setImageState(imageProxy.getHasImageIConState());
                }
            });
            retrievalThread.start();
        }
    }

    @Override
    public int getIconWidth() {
        return 800;
    }

    @Override
    public int getIconHeight() {
        return 600;
    }
}
