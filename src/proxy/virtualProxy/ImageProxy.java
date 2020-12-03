package proxy.virtualProxy;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * 虚拟代理：
 * <p>
 * 图片加载可能需要一点时间，在等待图片加载的时候，应该显示一点东西。
 * 我们也不希望在等待图片时整个应用程序被挂起。
 * 一旦图片被加载完成，刚才显示的东西应该消失，图片显示出来。
 */
public class ImageProxy implements Icon {

    //真正的图像类
    ImageIcon imageIcon;
    URL imageURL;
    Thread retrievalThread;
    boolean retrieval = false;

    public ImageProxy(URL imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        if (imageIcon != null) {
            imageIcon.paintIcon(c, g, x, y);
        } else {
            g.drawString("正在加载图片，请等待。。。", x + 300, y + 600);
            if (!retrieval) {
                retrievalThread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        imageIcon = new ImageIcon(imageURL,"图片");
                        c.repaint();
                    }
                });
                retrievalThread.start();
            }
        }
    }

    @Override
    public int getIconWidth() {
        if (imageIcon != null) {
            return imageIcon.getIconWidth();
        } else {

            return 800;
        }
    }

    @Override
    public int getIconHeight() {
        if (imageIcon != null) {
            return imageIcon.getIconHeight();
        } else {
            return 600;
        }
    }
}
