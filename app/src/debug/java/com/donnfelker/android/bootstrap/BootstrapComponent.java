package de.AwesomeSimpleApps.RsyncBackuper;

import de.AwesomeSimpleApps.RsyncBackuper.authenticator.BootstrapAuthenticatorActivity;
import de.AwesomeSimpleApps.RsyncBackuper.core.TimerService;
import de.AwesomeSimpleApps.RsyncBackuper.ui.BootstrapActivity;
import de.AwesomeSimpleApps.RsyncBackuper.ui.BootstrapFragmentActivity;
import de.AwesomeSimpleApps.RsyncBackuper.ui.BootstrapTimerActivity;
import de.AwesomeSimpleApps.RsyncBackuper.ui.CheckInsListFragment;
import de.AwesomeSimpleApps.RsyncBackuper.ui.MainActivity;
import de.AwesomeSimpleApps.RsyncBackuper.ui.NavigationDrawerFragment;
import de.AwesomeSimpleApps.RsyncBackuper.ui.NewsActivity;
import de.AwesomeSimpleApps.RsyncBackuper.ui.NewsListFragment;
import de.AwesomeSimpleApps.RsyncBackuper.ui.UserActivity;
import de.AwesomeSimpleApps.RsyncBackuper.ui.UserListFragment;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(
        modules = {
                AndroidModule.class,
                BootstrapModule.class
        }
)
public interface BootstrapComponent {

    void inject(BootstrapApplication target);

    void inject(BootstrapAuthenticatorActivity target);

    void inject(BootstrapTimerActivity target);

    void inject(MainActivity target);

    void inject(CheckInsListFragment target);

    void inject(NavigationDrawerFragment target);

    void inject(NewsActivity target);

    void inject(NewsListFragment target);

    void inject(UserActivity target);

    void inject(UserListFragment target);

    void inject(TimerService target);

    void inject(BootstrapFragmentActivity target);
    void inject(BootstrapActivity target);


}
