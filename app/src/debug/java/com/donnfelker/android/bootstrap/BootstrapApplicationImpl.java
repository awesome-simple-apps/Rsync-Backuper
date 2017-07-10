package de.AwesomeSimpleApps.RsyncBackuper;


import timber.log.Timber;

public class BootstrapApplicationImpl extends BootstrapApplication {

    @Override
    protected void onAfterInjection() {

    }

    @Override
    protected void init() {
        Timber.plant(new Timber.DebugTree());
    }
}
