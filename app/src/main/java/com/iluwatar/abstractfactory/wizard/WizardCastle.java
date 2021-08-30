package com.iluwatar.abstractfactory.wizard;

import com.iluwatar.abstractfactory.Castle;

public class WizardCastle implements Castle {

    static final String DESCRIPTION = "This is the Wizard castle!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
