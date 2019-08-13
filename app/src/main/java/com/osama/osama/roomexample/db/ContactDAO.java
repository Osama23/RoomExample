package com.osama.osama.roomexample.db;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;


import com.osama.osama.roomexample.db.entity.Contact;

import java.util.List;

@Dao
public interface ContactDAO
{
    // the return type of this method should be the same as the primary key
    @Insert
    public  long addContact(Contact contact);

    @Update
    public void updateContact(Contact contact);

    @Delete
    public void deleteContact(Contact contact);

    // the return type should be list of contact objects
    @Query("select * from contacts")
    public List<Contact> getContacts();

    //
    @Query("select * from contacts where contact_id ==:contactId")
    public Contact getContact(long contactId);

}
