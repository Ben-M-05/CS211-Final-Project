package com.javamaker.Api;

import java.util.ArrayList;
import javafx.scene.image.Image;

/**
 * <h2> ComponentAccessor </h2>
 * <i>The ComponentAcessor class will handle getting components of a certain body part type.</i>
 * 
 * <p> For example, if a user requests all "eye" assets with all its variations, this class will return 
 * all/one of them in an JavaFX Image ArrayList </p>
 * 
 * 
 * 
 * @author Ben Maigur
 * @version 0.0.1
 * 
 */
public class ComponentAccessor {
    
    /**
     * Gets all of the body part assets of a certain type
     * <p></p>
     * "Eye" -> All eye assets including alternates 
     * 
     * @throws Exception if the requested type returns null
     * @param partType
     * @return An ArrayList that contains all of the body parts of a certain type; each component will be 
     *         in an JavaFX Image object
     */
    public static ArrayList<Image> getAllOfPartType(String partType) {


        return new ArrayList<Image>();
    }
}
