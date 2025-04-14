package com.javamaker;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.concurrent.CountDownLatch;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import javafx.application.Platform;
import javafx.scene.image.Image;
import com.javamaker.Api.ImageHandler;
import com.javamaker.Modules.FileOrg;;



public class ImageHandlerTest {

    @BeforeClass 
    public static void startup() throws Exception{
        CountDownLatch latch = new CountDownLatch(1);
        Platform.startup(() -> {
            latch.countDown();
        });
        latch.await();
    }

    @Test
    public void FileValidation() {
        Image testImage = new Image(String.format("file: " + FileOrg.findFile("eye01")));
        Image resultImage = ImageHandler.translateImage("eye01");

        assertEquals(testImage.getUrl(), resultImage.getUrl());
    }


    @AfterClass
    public static void teardown() throws Exception {
        CountDownLatch latch = new CountDownLatch(1);
        Platform.exit();
        latch.countDown();
        latch.await();
    }
}
