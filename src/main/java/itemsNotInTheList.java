import java.util.List;

public class itemsNotInTheList extends Throwable {
    public itemsNotInTheList(List<String> itemNames) {
        super((Throwable) itemNames);
    }
}
