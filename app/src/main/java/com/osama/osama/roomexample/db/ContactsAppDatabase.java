package com.osama.osama.roomexample.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.osama.osama.roomexample.db.entity.Contact;

@Database(entities = {Contact.class},version = 1)
public abstract class ContactsAppDatabase extends RoomDatabase
{
    public abstract ContactDAO getContactDAO();

}
