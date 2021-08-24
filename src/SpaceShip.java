import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class SpaceShip {

    public final int pixelsPerPress = 2; // default value: move to 2 pixels by pressing
    private int dx;
    private int dy;
    private int x;
    private int y;
    private int width;
    private int height;
    private Image image;

    public SpaceShip() {
        loadImage();
        setX(getWidth());
        setY(getHeight());
    }

    private void loadImage() {
        ImageIcon imageIcon = new ImageIcon("src/resources/spaceship.png");
        setImage(imageIcon.getImage());
        setWidth(image.getWidth(null));
        setHeight(image.getHeight(null));
    }

    public void move() {
        x += dx;
        y += dy;
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        try {
            switch (key) {
                case KeyEvent.VK_LEFT: {
                    dx -= pixelsPerPress;
                    break;
                }
                case KeyEvent.VK_RIGHT: {
                    dx += pixelsPerPress;
                    break;
                }
                case KeyEvent.VK_UP: {
                    dy -= pixelsPerPress;
                    break;
                }
                case KeyEvent.VK_DOWN: {
                    dy += pixelsPerPress;
                    break;
                }
            }
        }
        catch (Exception ex) {
        System.out.println(ex);
        }
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        switch (key) {
            case KeyEvent.VK_LEFT:
            case KeyEvent.VK_RIGHT: {
                dx = 0;
                break;
            }
            case KeyEvent.VK_UP:
            case KeyEvent.VK_DOWN: {
                dy = 0;
                break;
            }
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int picWidth) {
        this.x = 800 / 2 - picWidth / 2;
    }

    public void setY(int picHeight) {
        this.y = 600 - picHeight * 2;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {

        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}
