public class HtmlListBuilder {
    public static void main(String[] args) {
        String[] items = {"Apples", "Bananas", "Oranges"};

        StringBuilder html = new StringBuilder();
        html.append("<ul>");
        for (String item : items) {
            html.append("<li>").append(item).append("</li>");
        }
        html.append("</ul>");

        String result = html.toString();
        System.out.println(result);
    }
}
