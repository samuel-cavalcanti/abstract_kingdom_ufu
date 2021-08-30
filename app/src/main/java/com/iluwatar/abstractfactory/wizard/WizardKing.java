package com.iluwatar.abstractfactory.wizard;

import com.iluwatar.abstractfactory.King;

public class WizardKing implements King {

    static final String DESCRIPTION = "This is the Wizard king!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
