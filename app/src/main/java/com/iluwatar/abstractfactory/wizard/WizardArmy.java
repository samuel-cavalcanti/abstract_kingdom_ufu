package com.iluwatar.abstractfactory.wizard;

import com.iluwatar.abstractfactory.Army;

public class WizardArmy implements Army {
    static final String DESCRIPTION = "This is the wizard army!";


    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
