package proxy.virtualProxy;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * 用状态者模式做一下
 */
public class ImageProxyByStatePattern implements Icon {
    Icon notImageIConState;
    Icon hasImageIConState;

    Icon imageIcon;

    Icon state = notImageIConState;

    public ImageProxyByStatePattern(URL imageURL) {
        this.notImageIConState = new NotImageIconState(this,imageURL);
        this.hasImageIConState = new HasImageIconState(this);
    }

    public void setImageState(Icon icon){
        state = icon;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        state.paintIcon(c,g,x,y);
    }

    @Override
    public int getIconWidth() {
        return state.getIconWidth();
    }

    @Override
    public int getIconHeight() {
        return state.getIconHeight();
    }

    public void setImageIcon(Icon imageIcon) {
        this.imageIcon = imageIcon;
    }

    public Icon getImageIcon() {
        return imageIcon;
    }

    public Icon getNotImageIConState() {
        return notImageIConState;
    }

    public Icon getHasImageIConState() {
        return hasImageIConState;
    }
}
