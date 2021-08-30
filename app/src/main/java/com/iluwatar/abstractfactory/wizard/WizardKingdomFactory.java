package com.iluwatar.abstractfactory.wizard;

import com.iluwatar.abstractfactory.Army;
import com.iluwatar.abstractfactory.Castle;
import com.iluwatar.abstractfactory.King;
import com.iluwatar.abstractfactory.KingdomFactory;

public class WizardKingdomFactory implements KingdomFactory {
    @Override
    public Castle createCastle() {
        return new WizardCastle();
    }

    @Override
    public King createKing() {
        return new WizardKing();
    }

    @Override
    public Army createArmy() {
        return new WizardArmy();
    }
}
