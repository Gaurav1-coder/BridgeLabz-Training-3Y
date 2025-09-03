package JavaClassAndObject.level2;

class ClassPalindrome {
    String text;

    ClassPalindrome(String text) {
        this.text = text;
    }

    boolean isPalindrome() {
        String rev = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(rev);
    }

    void display() {
        if (isPalindrome())
            System.out.println(text + " is a Palindrome");
        else
            System.out.println(text + " is NOT a Palindrome");
    }
}
