package com.dgmf.practicebeansautowiringanddi.interfaces.impl.speakers;

import com.dgmf.practicebeansautowiringanddi.interfaces.Speakers;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SonySpeakers implements Speakers {
    @Override
    public String makeSound() {
        return "Playing Music with Sony Speakers ...";
    }
}
