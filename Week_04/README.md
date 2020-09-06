# Week04 学习笔记

## DFS和BFS
DFS和BFS算法一般使用于二叉树、图等数据结构，各个过程具有重复性。
DFS本质就是递归。
BFS使用迭代实现，需要借助队列等其他数据结构。


## 贪心算法
贪心算法是通过找到每个步骤的最优解来得到全局最优解。
该算法有局限性，只适用于各个步骤的子过程相互无依赖。
通常能使用贪心算法求解的问题，贪心算法是性能最好的。

## 二分查找
二分查找适用于单调有序序列。
通过判断中间值与目标值的状态，缩小查找范围，时间复杂度一般为O(nlogn)。


### 寻找半有序数组最小数
```java
class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length -1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return nums[left];
    }
}
```
