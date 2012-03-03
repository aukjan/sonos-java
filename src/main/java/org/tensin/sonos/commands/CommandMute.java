package org.tensin.sonos.commands;

import org.tensin.sonos.upnp.Sonos;
import org.tensin.sonos.upnp.SonosException;

public class CommandMute extends AbstractCommand implements IZoneCommand {

    @Override
    public void execute(final Sonos sonos) throws SonosException {
        sonos.setMute(true);
    }

    @Override
    public String getName() {
        return "mute";
    }

}
