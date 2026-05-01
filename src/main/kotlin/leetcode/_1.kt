package pro.developia.leetcode

fun main() {
    var nums = intArrayOf(2, 7, 11, 15)
    var target = 17
    print(twoSum(nums, target).contentToString())
}


fun twoSum(nums: IntArray, target: Int): IntArray {
    val numMap = HashMap<Int, Int>()
    var answer = -1
    var complement = -1
    for (i in nums.indices) {
        complement = target - nums[i]

        if (numMap.containsKey(complement)) {
            answer = i
            break
        }

        numMap.put(nums[i], i)
    }
    return intArrayOf(numMap.get(complement)!!, answer)
}
