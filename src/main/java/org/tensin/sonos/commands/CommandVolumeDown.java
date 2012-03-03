package org.tensin.sonos.commands;

import org.tensin.sonos.upnp.Sonos;
import org.tensin.sonos.upnp.SonosException;

public class CommandVolumeDown extends AbstractCommand implements IZoneCommand {

    @Override
    public void execute(final Sonos sonos) throws SonosException {
        int previousVolume = sonos.volume();
        previousVolume = previousVolume - 5;
        if (previousVolume < 0) {
            previousVolume = 0;
        }
        sonos.volume(previousVolume);
    }

    @Override
    public String getName() {
        return "down";
    }

}
