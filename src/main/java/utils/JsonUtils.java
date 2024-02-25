package utils;

import Dto.Transaction;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtils {
    private static final ObjectMapper object = new ObjectMapper();

    public static String convertTransactionToJson(Transaction transaction){
        try{
            return object.writeValueAsString(transaction);
        } catch (JsonProcessingException e){
            e.printStackTrace();
            return null;
        }
    }
}
