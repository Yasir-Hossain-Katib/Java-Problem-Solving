import java.util.regex.*;

public class ExtractTransactionId {
    public static void main(String[] args) {
        String html = """
            <!DOCTYPE html>
            <html lang="en">
            <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>Transactions</title>
            </head>
            <body>
                <div>
                    <div class="button">
                        <p>Transaction Id: TXN1234</p>
                    </div>
                </div>
            </body>
            </html>
            """;

        Pattern pattern = Pattern.compile("Transaction Id: (TXN\\d+)");
        Matcher matcher = pattern.matcher(html);

        if (matcher.find()) {
            System.out.println("Transaction Id: " + matcher.group(1));
        }
    }
}
