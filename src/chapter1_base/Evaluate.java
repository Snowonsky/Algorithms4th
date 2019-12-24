package chapter1_base;

import java.util.Stack;

/**
 * @Description:双栈算术表达式求值算法
 * @Create: 2019-12-24-12:10
 */
public class Evaluate {
    public static void main(String[] args) {
        evl("(1+((2+3)*(4*5)))");
    }
    public static void evl(String str){
        Stack<Character> ops = new Stack<>();
        Stack<Double> values = new Stack<>();

        for(int i = 0;i<str.length();i++){
            char s = str.charAt(i);
            switch (s){
                case '(':
                    break;
                case '+':
                case '-':
                case '*':
                case '/':
                    ops.push(s);
                    break;
                case ')':
                    char op = ops.pop();
                    Double num = values.pop();
                    switch (op){
                        case '+':
                            num = num + values.pop();
                            break;
                        case '-':
                            num = num - values.pop();
                            break;
                        case '*':
                            num = num * values.pop();
                            break;
                        case '/':
                            num = num / values.pop();
                            break;
                    }
                    values.push(num);
                    break;
                default:
                    values.push(Double.parseDouble(Character.toString(s)));
                    break;
            }
        }
        System.out.println(values.pop());
    }
}
