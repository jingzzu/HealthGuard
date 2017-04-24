package com.yihaobeta.healthguard.database.entity;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "UNIVERSAL_DETAIL_ENTITY".
*/
public class UniversalDetailEntityDao extends AbstractDao<UniversalDetailEntity, String> {

    public static final String TABLENAME = "UNIVERSAL_DETAIL_ENTITY";

    /**
     * Properties of entity UniversalDetailEntity.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Key = new Property(0, String.class, "key", true, "KEY");
        public final static Property Id = new Property(1, int.class, "id", false, "ID");
        public final static Property Type = new Property(2, int.class, "type", false, "TYPE");
        public final static Property ImgUrl = new Property(3, String.class, "imgUrl", false, "IMG_URL");
        public final static Property Title = new Property(4, String.class, "title", false, "TITLE");
        public final static Property Message = new Property(5, String.class, "message", false, "MESSAGE");
        public final static Property Description = new Property(6, String.class, "description", false, "DESCRIPTION");
        public final static Property Keywords = new Property(7, String.class, "keywords", false, "KEYWORDS");
        public final static Property Price = new Property(8, float.class, "price", false, "PRICE");
        public final static Property MedicineType = new Property(9, String.class, "medicineType", false, "MEDICINE_TYPE");
        public final static Property Favorite = new Property(10, boolean.class, "favorite", false, "FAVORITE");
        public final static Property History = new Property(11, boolean.class, "history", false, "HISTORY");
        public final static Property TimeStamp = new Property(12, long.class, "timeStamp", false, "TIME_STAMP");
    }


    public UniversalDetailEntityDao(DaoConfig config) {
        super(config);
    }
    
    public UniversalDetailEntityDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"UNIVERSAL_DETAIL_ENTITY\" (" + //
                "\"KEY\" TEXT PRIMARY KEY NOT NULL ," + // 0: key
                "\"ID\" INTEGER NOT NULL ," + // 1: id
                "\"TYPE\" INTEGER NOT NULL ," + // 2: type
                "\"IMG_URL\" TEXT," + // 3: imgUrl
                "\"TITLE\" TEXT," + // 4: title
                "\"MESSAGE\" TEXT," + // 5: message
                "\"DESCRIPTION\" TEXT," + // 6: description
                "\"KEYWORDS\" TEXT," + // 7: keywords
                "\"PRICE\" REAL NOT NULL ," + // 8: price
                "\"MEDICINE_TYPE\" TEXT," + // 9: medicineType
                "\"FAVORITE\" INTEGER NOT NULL ," + // 10: favorite
                "\"HISTORY\" INTEGER NOT NULL ," + // 11: history
                "\"TIME_STAMP\" INTEGER NOT NULL );"); // 12: timeStamp
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"UNIVERSAL_DETAIL_ENTITY\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, UniversalDetailEntity entity) {
        stmt.clearBindings();
 
        String key = entity.getKey();
        if (key != null) {
            stmt.bindString(1, key);
        }
        stmt.bindLong(2, entity.getId());
        stmt.bindLong(3, entity.getType());
 
        String imgUrl = entity.getImgUrl();
        if (imgUrl != null) {
            stmt.bindString(4, imgUrl);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(5, title);
        }
 
        String message = entity.getMessage();
        if (message != null) {
            stmt.bindString(6, message);
        }
 
        String description = entity.getDescription();
        if (description != null) {
            stmt.bindString(7, description);
        }
 
        String keywords = entity.getKeywords();
        if (keywords != null) {
            stmt.bindString(8, keywords);
        }
        stmt.bindDouble(9, entity.getPrice());
 
        String medicineType = entity.getMedicineType();
        if (medicineType != null) {
            stmt.bindString(10, medicineType);
        }
        stmt.bindLong(11, entity.getFavorite() ? 1L: 0L);
        stmt.bindLong(12, entity.getHistory() ? 1L: 0L);
        stmt.bindLong(13, entity.getTimeStamp());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, UniversalDetailEntity entity) {
        stmt.clearBindings();
 
        String key = entity.getKey();
        if (key != null) {
            stmt.bindString(1, key);
        }
        stmt.bindLong(2, entity.getId());
        stmt.bindLong(3, entity.getType());
 
        String imgUrl = entity.getImgUrl();
        if (imgUrl != null) {
            stmt.bindString(4, imgUrl);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(5, title);
        }
 
        String message = entity.getMessage();
        if (message != null) {
            stmt.bindString(6, message);
        }
 
        String description = entity.getDescription();
        if (description != null) {
            stmt.bindString(7, description);
        }
 
        String keywords = entity.getKeywords();
        if (keywords != null) {
            stmt.bindString(8, keywords);
        }
        stmt.bindDouble(9, entity.getPrice());
 
        String medicineType = entity.getMedicineType();
        if (medicineType != null) {
            stmt.bindString(10, medicineType);
        }
        stmt.bindLong(11, entity.getFavorite() ? 1L: 0L);
        stmt.bindLong(12, entity.getHistory() ? 1L: 0L);
        stmt.bindLong(13, entity.getTimeStamp());
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }    

    @Override
    public UniversalDetailEntity readEntity(Cursor cursor, int offset) {
        UniversalDetailEntity entity = new UniversalDetailEntity( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // key
            cursor.getInt(offset + 1), // id
            cursor.getInt(offset + 2), // type
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // imgUrl
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // title
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // message
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // description
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // keywords
            cursor.getFloat(offset + 8), // price
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // medicineType
            cursor.getShort(offset + 10) != 0, // favorite
            cursor.getShort(offset + 11) != 0, // history
            cursor.getLong(offset + 12) // timeStamp
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, UniversalDetailEntity entity, int offset) {
        entity.setKey(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setId(cursor.getInt(offset + 1));
        entity.setType(cursor.getInt(offset + 2));
        entity.setImgUrl(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setTitle(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setMessage(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setDescription(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setKeywords(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setPrice(cursor.getFloat(offset + 8));
        entity.setMedicineType(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setFavorite(cursor.getShort(offset + 10) != 0);
        entity.setHistory(cursor.getShort(offset + 11) != 0);
        entity.setTimeStamp(cursor.getLong(offset + 12));
     }
    
    @Override
    protected final String updateKeyAfterInsert(UniversalDetailEntity entity, long rowId) {
        return entity.getKey();
    }
    
    @Override
    public String getKey(UniversalDetailEntity entity) {
        if(entity != null) {
            return entity.getKey();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(UniversalDetailEntity entity) {
        return entity.getKey() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
