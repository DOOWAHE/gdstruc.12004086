package com.gdstruc.module5;

public class SimpleHashtable {
    private StoredPlayer[] hashtable; //declare array that will back our hashtable

    public SimpleHashtable()
    {
        hashtable = new StoredPlayer[10];//should accommodate 10 in the beginning
    }

    //hashing function
    private int hashKey(String key)//key is your username
    {
        return key.length() % hashtable.length; //maps it within 0 and 10. Not the best implementation, but simple.
    }

    public void put(String key, Player value) //adding an element.
    {
        int hashedKey = hashKey(key);//the amount of characters you have

        if (isOccupied(hashedKey))//linear probing
        {
            int stoppingIndex = hashedKey;//determines when to stop linear probing
            if (hashedKey == hashtable.length -1)
            {
                hashedKey =0;
            }
            else
            {
                hashedKey++;
            }
            while (isOccupied(hashedKey) && hashedKey != stoppingIndex)
            {
                hashedKey = (hashedKey +1) % hashtable.length;
            }
        }
        //check if there is a value in the hashkey
        //collision happens when you hash two different values but same key
        if (isOccupied(hashedKey))
        {
            System.out.println("Sorry, there is an element at position" + hashedKey);
        }
        else
        {
            hashtable[hashedKey]= new StoredPlayer(key, value);
        }

    }

    private int findKey(String key)// this tracks which key it's set to
    {
        int hashedKey = hashKey(key);

        // found the right key?
        if (hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key)) {
            return hashedKey;

        }

        int stoppingIndex = hashedKey;//determines when to stop linear probing

        if (hashedKey == hashtable.length - 1) {
            hashedKey = 0;

        } else {
            hashedKey++;
        }

        while (hashedKey != stoppingIndex && hashtable[hashedKey] != null &&
                !hashtable[hashedKey].key.equals(key)) {
            hashedKey = (hashedKey + 1) % hashtable.length;
        }

        if (hashtable[hashedKey] !=null
        && hashtable[hashedKey].key.equals(key))
        {
            return hashedKey;
        }
        return -1;
    }

    public Player get(String key)
    {
        int hashedKey = findKey(key);

        if (hashedKey == -1)
        {
            return null;
        }

        return hashtable[hashedKey].value;
    }

    private boolean isOccupied(int index)
    {
        return hashtable[index] != null;
    }

    public void printHashtable()
    {
        for (int i=0; i< hashtable.length; i++)
        {
            if (hashtable[i] !=null) {
                System.out.println("Element" + i + " " + hashtable[i].value);
            }
            else
            {
                System.out.println("Element" + i + "null");
            }
        }

    }

    public void remove(String key)
    {
        int tombstone = hashKey(key);
        //if it's not occupied (null) then keep moving. we wanna remove the ones that are occupied
        if (!isOccupied(tombstone))//linear probing
        {
            int stoppingIndex = tombstone;//determines when to stop linear probing
            if (tombstone == hashtable.length -1)
            {
                tombstone =0;
            }
            else
            {
                tombstone++;
            }
            while (!isOccupied(tombstone) && tombstone != stoppingIndex)
            {
                tombstone = (tombstone +1) % hashtable.length;
            }
        }
        if (!isOccupied(tombstone))
        {
            System.out.println("Sorry, this one is already empty" + tombstone);
        }
        else
            hashtable[tombstone] = null;

    }

}
