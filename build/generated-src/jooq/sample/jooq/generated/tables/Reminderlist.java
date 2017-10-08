/*
 * This file is generated by jOOQ.
*/
package jooq.generated.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.generated.Keys;
import jooq.generated.Public;
import jooq.generated.tables.records.ReminderlistRecord;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Reminderlist extends TableImpl<ReminderlistRecord> {

    private static final long serialVersionUID = 561694955;

    /**
     * The reference instance of <code>public.reminderlist</code>
     */
    public static final Reminderlist REMINDERLIST = new Reminderlist();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ReminderlistRecord> getRecordType() {
        return ReminderlistRecord.class;
    }

    /**
     * The column <code>public.reminderlist.id</code>.
     */
    public final TableField<ReminderlistRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('reminderlist_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.reminderlist.userid</code>.
     */
    public final TableField<ReminderlistRecord, String> USERID = createField("userid", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.reminderlist.channelid</code>.
     */
    public final TableField<ReminderlistRecord, String> CHANNELID = createField("channelid", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.reminderlist.guildid</code>.
     */
    public final TableField<ReminderlistRecord, String> GUILDID = createField("guildid", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.reminderlist.createtime</code>.
     */
    public final TableField<ReminderlistRecord, Long> CREATETIME = createField("createtime", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.reminderlist.remindtime</code>.
     */
    public final TableField<ReminderlistRecord, Long> REMINDTIME = createField("remindtime", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.reminderlist.reminded</code>.
     */
    public final TableField<ReminderlistRecord, Boolean> REMINDED = createField("reminded", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>public.reminderlist.message</code>.
     */
    public final TableField<ReminderlistRecord, String> MESSAGE = createField("message", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>public.reminderlist</code> table reference
     */
    public Reminderlist() {
        this("reminderlist", null);
    }

    /**
     * Create an aliased <code>public.reminderlist</code> table reference
     */
    public Reminderlist(String alias) {
        this(alias, REMINDERLIST);
    }

    private Reminderlist(String alias, Table<ReminderlistRecord> aliased) {
        this(alias, aliased, null);
    }

    private Reminderlist(String alias, Table<ReminderlistRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ReminderlistRecord, Integer> getIdentity() {
        return Keys.IDENTITY_REMINDERLIST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ReminderlistRecord> getPrimaryKey() {
        return Keys.REMINDERLIST_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ReminderlistRecord>> getKeys() {
        return Arrays.<UniqueKey<ReminderlistRecord>>asList(Keys.REMINDERLIST_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Reminderlist as(String alias) {
        return new Reminderlist(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Reminderlist rename(String name) {
        return new Reminderlist(name, null);
    }
}