package de.AwesomeSimpleApps.RsyncBackuper;

import android.accounts.AccountsException;
import android.app.Activity;

import de.AwesomeSimpleApps.RsyncBackuper.core.BootstrapService;

import java.io.IOException;

public interface BootstrapServiceProvider {
    BootstrapService getService(Activity activity) throws IOException, AccountsException;
}
