package Misc;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

@Component
@SessionScope
public class basket {

    private final List<Integer> items;

    public basket() {
        this.items = new ArrayList<>();
    }

    public List<Integer> addItems(List<Integer> idList){
        items.addAll(idList);
        return idList;
    }

    public List<Integer> getItems() {
        return Collections.unmodifiableList(items);
    }
}
