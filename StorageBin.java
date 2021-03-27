

import java.util.ArrayList;

/**
 * A class which stores items with unique identifiers
 * @param <T>
 * @param <U>
 */
public class StorageBin<T,U> {

    private ArrayList<T> itemsStored;
    private ArrayList<U> itemIDs;


    /**
     * Setting up the lists
     */
    public StorageBin(){
        itemsStored = new ArrayList<T>();
        itemIDs = new ArrayList<U>();
        //Your work starts here
    }

    //get the size of items stores in the array list.
    public int sizeofBin(){
        return itemsStored.size();
    }

    //add item or id to the specif array lists.
    public void addItem(T item, U id){
        String error;
        if (itemIDs.contains(id)){
            //error message if a unique id is not used.
            System.out.println("Error,ID already used");
        }
        else{
            itemsStored.add(item);
            itemIDs.add(id);
        }
    }

    //remove item from the array list.
    public T removeItem(U id){
        if (itemIDs.contains(id)) {
            return itemsStored.remove(itemIDs.indexOf(id));
        }
        return null;


    }
     // display the items in the array list.
    public void displayItems(){
        for (int i =0 ; i < itemsStored.size();i++){
            System.out.println("Item:" +itemsStored.get(i) +" "+ "ID: " + itemIDs.get(i) + "\n");
        }
    }



}
