package responsibility.chain;

public class MyLittleNettyTester {

    public static void main(String[] args) {
        Handler byteBufToString = new ByteBufferToString();
        Handler stringToObject = new StringToObject();
        byteBufToString.link(stringToObject);

        boolean messageProcessed = byteBufToString.process(
                new Message("ClientMessage", "I THINK I SHOULD USE GOLANG TO TURN MY TCP SERVER ON!"));
        if (messageProcessed) {
            System.out.println("Wow, message was processed!");
        } else {
            System.out.println("Something got broken again!");
        }
    }

}
