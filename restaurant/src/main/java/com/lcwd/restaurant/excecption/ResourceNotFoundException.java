package com.lcwd.restaurant.excecption;


public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(){
        super("id not found");
    }

   public ResourceNotFoundException(String message){
        super(message);
    }

}
