package rs.pedjaapps.eventlogger.model;

import rs.pedjaapps.eventlogger.model.DaoSession;
import de.greenrobot.dao.DaoException;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;
// KEEP INCLUDES END
/**
 * Entity mapped to table "EVENT".
 */
public class Event implements Parcelable {

    private Long id;
    /** Not-null value. */
    private java.util.Date timestamp;
    private String short_desc;
    private String long_desc;
    private int type;
    private int level;
    private Long icon_id;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient EventDao myDao;

    private Icon icon;
    private Long icon__resolvedKey;


    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public Event() {
    }

    public Event(Long id) {
        this.id = id;
    }

    public Event(Long id, java.util.Date timestamp, String short_desc, String long_desc, int type, int level, Long icon_id) {
        this.id = id;
        this.timestamp = timestamp;
        this.short_desc = short_desc;
        this.long_desc = long_desc;
        this.type = type;
        this.level = level;
        this.icon_id = icon_id;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getEventDao() : null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /** Not-null value. */
    public java.util.Date getTimestamp() {
        return timestamp;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getShort_desc() {
        return short_desc;
    }

    public void setShort_desc(String short_desc) {
        this.short_desc = short_desc;
    }

    public String getLong_desc() {
        return long_desc;
    }

    public void setLong_desc(String long_desc) {
        this.long_desc = long_desc;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Long getIcon_id() {
        return icon_id;
    }

    public void setIcon_id(Long icon_id) {
        this.icon_id = icon_id;
    }

    /** To-one relationship, resolved on first access. */
    public Icon getIcon() {
        Long __key = this.icon_id;
        if (icon__resolvedKey == null || !icon__resolvedKey.equals(__key)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            IconDao targetDao = daoSession.getIconDao();
            Icon iconNew = targetDao.load(__key);
            synchronized (this) {
                icon = iconNew;
            	icon__resolvedKey = __key;
            }
        }
        return icon;
    }

    public void setIcon(Icon icon) {
        synchronized (this) {
            this.icon = icon;
            icon_id = icon == null ? null : icon.getId();
            icon__resolvedKey = icon_id;
        }
    }

    /** Convenient call for {@link AbstractDao#delete(Object)}. Entity must attached to an entity context. */
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.delete(this);
    }

    /** Convenient call for {@link AbstractDao#update(Object)}. Entity must attached to an entity context. */
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.update(this);
    }

    /** Convenient call for {@link AbstractDao#refresh(Object)}. Entity must attached to an entity context. */
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.refresh(this);
    }

    // KEEP METHODS - put your custom methods here


    @Override
    public int describeContents()
    {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags)
    {
        dest.writeValue(this.id);
        dest.writeLong(timestamp != null ? timestamp.getTime() : -1);
        dest.writeString(this.short_desc);
        dest.writeString(this.long_desc);
        dest.writeInt(this.type);
        dest.writeInt(this.level);
        if(icon_id != null)dest.writeLong(this.icon_id);
    }

    private Event(Parcel in)
    {
        this.id = (Long) in.readValue(Long.class.getClassLoader());
        long tmpTimestamp = in.readLong();
        this.timestamp = tmpTimestamp == -1 ? null : new Date(tmpTimestamp);
        this.short_desc = in.readString();
        this.long_desc = in.readString();
        this.type = in.readInt();
        this.level = in.readInt();
        this.icon_id = in.readLong();
    }

    public static Creator<Event> CREATOR = new Creator<Event>()
    {
        public Event createFromParcel(Parcel source)
        {
            return new Event(source);
        }

        public Event[] newArray(int size)
        {
            return new Event[size];
        }
    };

    @Override
    public String toString()
    {
        return "Event{" +
                "id=" + id +
                ", timestamp=" + timestamp +
                ", short_desc='" + short_desc + '\'' +
                ", long_desc='" + long_desc + '\'' +
                ", type=" + type +
                ", level=" + level +
                '}';
    }
    // KEEP METHODS END

}
