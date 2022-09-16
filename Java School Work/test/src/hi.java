public class hi {

        public static void main(String[]args) {
            String color = "His black suit is not white";
            String text = "Horse, penguin, DoG, tortOIse, whale , KITTEN";
            String[] array = {"Horse penguin DoG tortOIse whale KITTEN aids"};
            task1(text);
            task2(array);
            task3(text);
            System.out.println("\n" + task4(color));

        }
        public static void task1(String x) {
            String text = x.toLowerCase();
            String[] words = text.split(",");
            for (int i = 0; i <= words.length - 1; i++) {
                System.out.println(words[i].trim());
            }
        }

        public static void task2(String[] array) {
            String[] words = {""};
            String morewords = "Horse penguin DoG tortOIse whale KITTEN aids";
            for (int i = 0; i <= array.length - 1; i++) {
                words = morewords.split(" ");
            }
            System.out.println("\n" + words.length);
        }
        public static void task3(String text) {
            String empty = "";
            String tower = "This is a great day";
            //String tower = "Eiffel tower";
            String[] towersplit = tower.split("");
            for (int i =  1; i <= towersplit.length - 1; i=i+2) {
                empty += towersplit[i];
            }
            System.out.println(empty);
        }
        public static String task4(String text) {
            String[] colors = {"red", "green", "blue", "orange", "yellow", "white", "purple", "cyan", "black" };
            text = text.toLowerCase();
            String[] words = text.split(" ");
            for (int i = 0; i <= words.length - 1; i++) {
                for (int b = 0; b <= colors.length - 1; b++) {
                    if(words[i].equals(colors[b])) {
                        return colors[b];
                    }
                }
            }
            return null;
        }


}
