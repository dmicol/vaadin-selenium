package xotonic;

/**
 * Created by xotonic on 25.09.2016.
 */
public enum DomId {
    BUTTON,
    TEXTFIELD,
    COMBOBOX,
    CHECKBOX
    ;
    DomId()
    {
        id = this.name().toLowerCase().replace('_', '-');
    }

    private String id;

    String getId()
    {
        return id;
    }
}
