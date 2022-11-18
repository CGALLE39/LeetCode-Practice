package blockchain;

import java.util.Arrays;

public class Block {
    private int previousHash;
    private String Data;
    private int hash;

    public Block(String data, int previousHash){

//        this.data=data;
        this.previousHash=previousHash;

        //creating block ~

        this.hash = Arrays.hashCode(new Integer[]{data.hashCode(), previousHash});
    }
}
