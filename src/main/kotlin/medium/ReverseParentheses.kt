package org.example.medium

class Solution {
    fun reverseParentheses(str: String): String {
        var result = str; var ref1 :Int?; var ref2 :Int?; var trig = false
        do {
            trig = false
            ref1 = null
            ref2 = null

            for (elem in 0..result.length - 1) {
                if (result[elem] == '(') {
                    ref1 = elem
                    trig = true
                }
                if (result[elem] == ')') {
                    ref2 = elem
                    if (ref1 != null) break
                }
            }

            if (ref1!=null && ref2!=null) {
                val reversed = result.substring(ref1+1, ref2).reversed()
                println("Reversed:" +reversed)
                result = result.substring(0, ref1) + reversed + result.substring(ref2 + 1)
                println(result)
            }

        }while (trig)

        return result
    }

}