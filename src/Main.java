import java.util.List;

public class Main {
    public static void main(String[] args) {
        var treeString = new NonBalancedBinarySearchTree<String>();

        List<String> stringList = List.of("them boys", "moving car", "sugar daddy", " ");

        for (String value: stringList) {
            treeString.add(value);
        }
        treeString.parse();
    }
}