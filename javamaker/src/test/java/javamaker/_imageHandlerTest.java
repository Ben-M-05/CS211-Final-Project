package javamaker;
import com.javamaker.Api.ImageHandler;

import javafx.scene.image.Image;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class _imageHandlerTest {

    @Test
    public void UrlValidation() {
        Image testImage = new Image("https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.L_5JZLL1ViqkPNbgOQoBDAHaE7%26pid%3DApi&f=1&ipt=07bf0bb78d02b7369778c80a20e7fc0b09e328d29ce6ae475f31038ee5c4c969&ipo=images");
        Image handlerImage = ImageHandler.translateImage("https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.L_5JZLL1ViqkPNbgOQoBDAHaE7%26pid%3DApi&f=1&ipt=07bf0bb78d02b7369778c80a20e7fc0b09e328d29ce6ae475f31038ee5c4c969&ipo=images");
        assertEquals(testImage.toString().equals(handlerImage.toString()), true);
    }

}
