//package salary_slip;
//
//import com.mongodb.MongoClient;
//import com.mongodb.client.MongoCollection;
//import com.mongodb.client.MongoDatabase;
//import org.bson.Document;
//
//public class MongoConnection {
//  private static MongoConnection mongoConnection;
//  private final MongoClient mongoClient;
//  private final MongoDatabase mongoDatabase;
//  private final MongoCollection<Document> mongoCollection;
//
//  private MongoConnection() {
//    this.mongoClient = new MongoClient();
//    this.mongoDatabase = mongoClient.getDatabase("salarySlipKata");
//    this.mongoCollection = mongoDatabase.getCollection("employees");
//  }
//
//  public static MongoConnection getInstance() {
//    if (mongoConnection == null) {
//      initializeClient();
//      return new MongoConnection();
//    }
//    else return mongoConnection;
//  }
//
//  private static void initializeClient() {
//    mongo
//  }
//}
