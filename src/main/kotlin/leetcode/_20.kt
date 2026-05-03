package pro.developia.leetcode

import java.util.ArrayDeque


fun main() {
//    val s = "()[]{}"
//    val s = ")"
//    val s = "((()))}"
    val s = "([])"
    print(isValid(s))

}

fun isValid(s: String): Boolean {
    val stack = ArrayDeque<Char>()
    val toCharArray = s.toCharArray()
    var index = -1
    for (c in toCharArray) {
        if (c == '(' || c == '[' || c == '{') {
            stack.add(c)
            index++
        } else {
            if (stack.peekLast() != null && isMatch(stack.peekLast(), c)) {
                stack.pollLast()
                index--
            } else {
                return false
            }
        }
    }

    return index == -1
}


fun isMatch(s: Char, s2: Char): Boolean {
    if (s == '(' && s2 == ')') {
        return true
    } else if (s == '{' && s2 == '}') {
        return true
    } else if (s == '[' && s2 == ']') {
        return true
    }
    return false
}
