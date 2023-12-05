def import import sys
import os
import sys
import math
import string
import string
import string
import sys
import string
import sys
import string
import string
import sys
import string
import sys
input = sys.stdin
n = int ( sys.stdin.readline ( ) )
input = string.split ( input )
values = [ int ( i ) for i in input ]
values = [ float ( i ) for i in values ]
values = [ float ( i ) for i in values ]
state = True
sum1 , sum2 = 0 , 0
for i in range ( n - 1 , - 1 , - 1 ) :
    if state :
        sum1 += values [ i ]
        state = False
    else :
        sum2 += values [ i ]
        state = True
    print ( abs ( sum1 - sum2 ) )
