package com.dgmf.aop.interfaces.impl.speakers;

import com.dgmf.aop.entity.Song;
import com.dgmf.aop.interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeakers implements Speakers {

    public String makeSound(Song song){
        return "Playing the song "+ song.getTitle()+ " by "
                + song.getSingerName()+
                " with Bose speakers";
    }

}
