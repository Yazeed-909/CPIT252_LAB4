
package com.mycompany.factorybuilder;


public class CharacterFactory {

    // TODO: Add a factory method that returns an object (Archer, FlagBearer, or Knight) by its name:
    public static Characters createCharacter(CharacterTypes type, String name){
        
        
        
        if(type.equals(CharacterTypes.ARCHER)){
            
          
          return new Archer(name);
            
            
        }
         if(type.equals(CharacterTypes.KNIGHT)){
            
             
             
          return new Knight(name);
            
            
        }
        
         if(type.equals(CharacterTypes.FLAG_BEARER)){
          
          return new FlagBearer(name);
            
            
        }
         
         
         
        return null;
    }
}
