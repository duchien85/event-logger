package rs.pedjaapps.eventlogger.model;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "ICON".
 */
public class Icon {

    private Long id;
    private byte[] icon;

    public Icon() {
    }

    public Icon(Long id) {
        this.id = id;
    }

    public Icon(Long id, byte[] icon) {
        this.id = id;
        this.icon = icon;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public byte[] getIcon() {
        return icon;
    }

    public void setIcon(byte[] icon) {
        this.icon = icon;
    }

}
