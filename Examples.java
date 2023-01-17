import java.util.*;

public class Examples {
        public static void main(String[] agrs) {
            Scanner input = new Scanner(System.in);
            Stack songs = new Stack(5);
            songs.push("We will rock you");
            songs.push("We are the champions");
            songs.push("Crazy frog");
            songs.push("Highway to hell");
            songs.push("In Da club");
            System.out.println("When you like song in Youtube, it go at the beginning.");
            System.out.println("Like in Stack. Last in, first out. ");
            for (int i = 1; i <= 5; i++){
                System.out.println(songs.peek());
                songs.pop();
            }
            Queue days = new Queue(7);
            days.add("Monday");
            days.add("Tuesday");
            days.add("Wednesday");
            days.add("Thursday");
            days.add("Friday");
            days.add("Saturday");
            days.add("Sunday");
            System.out.println("Queue: days of the week");
            System.out.println("Queue size is " + days.size());
            System.out.println("I will swim on " + days.peek());
            days.remove();
            System.out.println("I will run on " + days.peek());
            days.remove();
            System.out.println("I will go date on " + days.peek());
            days.remove();
            System.out.println("I will work on " + days.peek());
            days.remove();
            System.out.println("I will go disco on " + days.peek());
            days.remove();
            System.out.println("I will play game on " + days.peek());
            days.remove();
            System.out.println("I will watch TV on " + days.peek());
            HashMap<String, String> translate = new HashMap<>();
            System.out.println("HashMap: dictionary");
            translate.put("German", "Deutsch");
            translate.put("Dictionary", "Wörterbuch");
            translate.put("Translate", "Übersetzen");
            translate.put("Language", "Sprache");
            translate.put("School", "Schule");
            translate.display();
            System.out.println("Binary Tree ");
            BinaryTree trees = new BinaryTree();
            Tree root = new Tree(4);
            trees.addRecursive(root, 8);
            trees.addRecursive(root, 6);
            trees.addRecursive(root, 14);
            trees.addRecursive(root, 10);
            trees.addRecursive(root, 25);
            trees.addRecursive(root, 15);
            trees.traverseInOrder(root);
            System.out.println();
            System.out.println("ArrayList: names");
            ArrayList list = new ArrayList();
            list.add("Alexander Ivanov");
            list.add("Borislava Lazarova");
            list.add("Dimitar Petrov");
            list.add("Gergana Spasova");
            list.add("Hristo Manolev");
            list.add("Ivana Marinova");
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        }

}
