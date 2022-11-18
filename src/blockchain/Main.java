package blockchain;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Block> blockChainList=new ArrayList<>();

        Block genesis = new Block("Blockchain",0);

        blockChainList.add(genesis);

        Block blockX = new Block("Hello", blockChainList.get(blockChainList.size()-1).hashCode());
        blockChainList.add(blockX);

        Block blockY = new Block("owo", blockChainList.get(blockChainList.size()-1).hashCode());
        blockChainList.add(blockX);

        Block blockZ = new Block("uwu", blockChainList.get(blockChainList.size()-1).hashCode());
        blockChainList.add(blockX);

        System.out.println("$$$");
        System.out.println("blockchain test");
        System.out.println("$$$");

        blockChainList.forEach(System.out::println);

        System.out.println("$$$");

    }
}
