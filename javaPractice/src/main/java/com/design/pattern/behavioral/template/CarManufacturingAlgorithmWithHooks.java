package com.design.pattern.behavioral.template;

/**
 * Created by manish on 5/10/17.
 */
public class CarManufacturingAlgorithmWithHooks {

    public void buildCar() {

    }

    public void buildChasis() {
        // build chasis
    }

    public void buildEngine() {
        // build engine
    }

    public void buildBody() {
        // buildbody
    }

    public void addFeatures() {
        // add basic features
        addAdvancedFeatures();
    }

    // this is the hook. Subclasses do not have remember to call parents method
    // to add the basic features.
    public void addAdvancedFeatures() {
        System.out.println("super adding advance feature");
    }
}