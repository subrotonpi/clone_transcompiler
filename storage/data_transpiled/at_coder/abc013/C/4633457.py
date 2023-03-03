def import import sys
import math
import math
import math
import math
import math
import math
import math
import math
import math
N = math.factorial
H = math.factorial
A = math.factorial
B = math.factorial
C = math.factorial
D = math.factorial
E = math.factorial
need_h = N * E - H
B += E
D += E
cost = math.inf
for a_num in range ( 0 , N ) :
    a_cost = A * a_num
    tmp_need_h = need_h - B * a_num
    if tmp_need_h < 0 :
        cost = min ( cost , a_cost )
        break
    c_num = int ( math.ceil ( float ( tmp_need_h ) / D ) )
    if tmp_need_h % D == 0 :
        c_num += 1
    cost = min ( cost , a_cost + c_num * C )
out ( cost )
