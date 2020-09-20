# Week06 学习笔记

## 动态递归步骤
* 1.找重复子结构
* 2.存储中间状态
* 3.找递归方程

## 常见题型

### 最大公共子串
* 递归方程
>text1[i] == text2[j]时, dp[i][j] = dp[i-1][j-1] + 1
>text1[i] != text2[j]时, dp[i][j] = max(dp[i-1][j], dp[i][j-1]) + 1

### 最大子序列
* 递归方程
>dp[n] = max(dp[n-1], 0) + nums[n]


### 硬币兑换
* 递归方程
>dp[i] = min(dp[i], dp[i-coins[j]]+1)
