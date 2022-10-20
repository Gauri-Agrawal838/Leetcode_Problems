# Number Formation
## Hard
<div class="problems_problem_content__Xm_eO" style="user-select: auto;"><p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;">Given three integers <strong style="user-select: auto;">x, y,</strong> and <strong style="user-select: auto;">z,</strong> the task is to find the sum of all the numbers formed by&nbsp;<br style="user-select: auto;">
having 4 at most x times, having 5 at most y times, and having 6 at most z times as a digit.</span></p>

<p style="user-select: auto;"><span style="font-size: 20px; user-select: auto;"><strong style="user-select: auto;">Note: </strong></span><span style="font-size: 18px; user-select: auto;">Output&nbsp;the sum modulo 10<sup style="user-select: auto;">9</sup>+7.</span></p>

<p style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></span></p>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input</strong>: X = 1, Y = 1, Z = 1 
<strong style="user-select: auto;">Output:</strong> 3675</span>
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Explanation</strong>: 4 + 5 + 6 + 45 + 54 + 56 
+ 65 + 46 + 64 + 456 + 465 
+ 546 + 564 + 645 + 654 = 3675</span></pre>

<div style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></span></div>

<pre style="user-select: auto;"><span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Input: </strong>X = 0, Y = 0, Z = 0
<strong style="user-select: auto;">Output: </strong>0
<strong style="user-select: auto;">Explanation</strong>: No number can be formed</span></pre>

<p style="user-select: auto;"><br style="user-select: auto;">
<span style="font-size: 18px; user-select: auto;"><strong style="user-select: auto;">Your Task:&nbsp;&nbsp;</strong><br style="user-select: auto;">
You don't need to read input or print anything. Complete the function <strong style="user-select: auto;"><code style="user-select: auto;">getSum</code>()&nbsp;</strong>which takes <strong style="user-select: auto;">X, Y</strong> and <strong style="user-select: auto;">Z </strong>as input parameters and returns the integer value<br style="user-select: auto;">
<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Time Complexity:</strong> O(<strong style="user-select: auto;">X*Y*Z</strong>)<br style="user-select: auto;">
<strong style="user-select: auto;">Expected Auxiliary Space:</strong> O(<strong style="user-select: auto;">X*Y*Z</strong>)<br style="user-select: auto;">
<br style="user-select: auto;">
<strong style="user-select: auto;">Constraints:</strong><br style="user-select: auto;">
0 ≤ <strong style="user-select: auto;">X, Y, Z</strong> ≤ 60</span></p>
</div>