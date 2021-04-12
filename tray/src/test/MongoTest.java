//import com.mongodb.MongoClient;
//import com.mongodb.client.MongoCollection;
//import com.mongodb.client.MongoDatabase;
//import com.mongodb.client.model.Filters;
//import com.mongodb.client.result.DeleteResult;
//import com.mongodb.client.result.UpdateResult;
//import org.bson.Document;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//
//class MongoTest {
//  MongoClient mongoClient;
//  MongoDatabase db;
//  MongoCollection<Document> mongoCollection;
//
//  // UTILITIES
//  private Document getFirstDoc() {
//    List<Document> docs = mongoCollection.find().into(new ArrayList<>());
//    return docs.get(0);
//  }
//
//  private void printDocs() {
//    List<Document> docs = mongoCollection.find().into(new ArrayList<>());
//    for (Document doc : docs)
//      System.out.println(doc);
//  }
//
//  private int countDocuments() {
//    List<Document> list = mongoCollection.find().into(new ArrayList<>());
//
//    return list.size();
//  }
//
//  @BeforeEach
//  public void setup() {
//    mongoClient = new MongoClient();
//    db = mongoClient.getDatabase("testDb");
//    mongoCollection = db.getCollection("testCollection");
//    System.out.println("--------------- \n---------------" + db);
//  }
//
//  @Test
//  void createMongoClient() throws Exception {
//    assertNotNull(mongoClient);
//  }
//
//  @Test
//  void getDB() throws Exception {
//    assertNotNull(db);
//  }
//
//  @Test
//  void getCollection() throws Exception {
//    assertNotNull(mongoCollection);
//  }
//
//  @Test
//  void insertDocument() throws Exception {
//    Document doc = new Document("_id", 1).append("name", "taylor");
//    mongoCollection.insertOne(doc);
//    assertEquals(1, mongoCollection.count());
//  }
//
//  @Test
//  void getDocument() throws Exception {
//    Document doc = new Document("_id", 1).append("name", "taylor");
//
//    mongoCollection.insertOne(doc);
//    Document docRetrieved = mongoCollection.find().first();
//    assertEquals("taylor", docRetrieved.get("name"));
//  }
//
//  @Test
//  void updateDocument() throws Exception {
//    Document docBeforeUpdate = new Document("_id", "1").append("name", "taylor");
//    Document docAfterUpdate = new Document("name", "ben");
//
//    mongoCollection.insertOne(docBeforeUpdate);
//    UpdateResult updateResult = mongoCollection.updateOne(Filters.eq("_id", "1"), new Document("$set", docAfterUpdate));
//    assertEquals(1, updateResult.getModifiedCount());
//  }
//
//  @Test
//  void deleteDocument() throws Exception {
//    Document doc = new Document("_id", 1).append("name", "taylor");
//
//    mongoCollection.insertOne(doc);
//    DeleteResult deleteResult = mongoCollection.deleteOne(Document.parse("{_id:1}"));
//    assertEquals(1, deleteResult.getDeletedCount());
//  }
//
//  @AfterEach
//  public void teardown() {
//    mongoCollection.drop();
//    db.drop();
//    mongoClient.close();
//  }
//}
