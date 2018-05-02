/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.ArrayList;

/**
 *
 * @author Anuruddha
 */
public class Main {
    
    ArrayList<Block> blockchain = new ArrayList<>();
    
    public static void main(String[] args) {
        
        String[] genesisTransactions = {"Kamal sent 100 lkr to Saman","Saman sent 10 lkr to Ruwan"};
        Block genesisBlock = new Block(0, genesisTransactions);
        
        String[] block2Transactions = {"Saman sent 100 lkr to Ruwan","Kamal sent 10 lkr to Saman"};
        Block block2 = new Block(genesisBlock.getBlockHash(), block2Transactions);
        
        System.out.println("Hash of genesis block "+genesisBlock.getBlockHash());
        System.out.println("Hash of block2 "+block2.getBlockHash());
    }
}
