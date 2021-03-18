import com.mongodb.*;
import com.mongodb.util.JSON;

import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

public class mongo {



    public static void main(String[] args) throws UnknownHostException
        {
            MongoClient mongo = new MongoClient();
            DB db = mongo.getDB("sampleDatabase");
            DBCollection collection = db.getCollection("Sample Collection");

            WriteResult result = collection.remove(new BasicDBObject());

            basicDBObject_Example(collection);

            basicDBObjectBuilder_Example(collection);

            hashMap_Example(collection);

            parseJSON_Example(collection);

            DBCursor cursor = collection.find();
            while(cursor.hasNext()) {
                System.out.println(cursor.next());
            }
        }

        private static void basicDBObject_Example(DBCollection collection){
            BasicDBObject document = new BasicDBObject();
            document.put("name", "Abdullah");
            document.put("surname", "Nana");

            BasicDBObject documentDetail = new BasicDBObject();
            documentDetail.put("addressLine1", "Rustenburg");
            documentDetail.put("addressLine2", "Zinniaville");
            documentDetail.put("addressLine3", "North West");

            document.put("address", documentDetail);

            collection.insert(document);
        }

        private static void basicDBObjectBuilder_Example(DBCollection collection){
            BasicDBObjectBuilder documentBuilder = BasicDBObjectBuilder.start()
                    .add("name", "Taylor")
                    .add("surname", "Ray");

            BasicDBObjectBuilder documentBuilderDetail = BasicDBObjectBuilder.start()
                    .add("addressLine1", "Boksburg")
                    .add("addressLine2", "Johannesburg")
                    .add("addressLine3", "Gauteng");

            documentBuilder.add("address", documentBuilderDetail.get());

            collection.insert(documentBuilder.get());
        }

        private static void hashMap_Example(DBCollection collection){
            Map<String, Object> documentMap = new HashMap<String, Object>();
            documentMap.put("name", "Ruben");
            documentMap.put("surname", "Ferriera");

            Map<String, Object> documentMapDetail = new HashMap<String, Object>();
            documentMapDetail.put("addressLine1", "Boksburg");
            documentMapDetail.put("addressLine2", "Johannesburg");
            documentMapDetail.put("addressLine3", "Gauteng");

            documentMap.put("address", documentMapDetail);

            collection.insert(new BasicDBObject(documentMap));
        }

        private static void parseJSON_Example(DBCollection collection){
            String json = "{ 'name' : 'Vincent' , " +
                    "'surname' : 'Moyo' , " +
                    "'address' : { 'addressLine1' : 'Benoni' , " +
                    "'addressLine2' : 'Johannesburg' , " +
                    "'addressLine3' : 'Gauteng'}" +
                    "}";

            DBObject dbObject = (DBObject) JSON.parse(json);

            collection.insert(dbObject);
        }


}
