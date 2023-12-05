def import import sys
import os
import sys
import string
import string
import sys
import string
import sys
import string
import sys
input = sys.stdin
out = sys.stdout
tokens = input.split ( ' ' )
k = int ( tokens [ 0 ] )
s = int ( tokens [ 1 ] )
count = 0
for i in range ( 0 , k ) :
    for j in range ( 0 , k ) :
        if s >= i + j and s - ( i + j ) <= k :
            count += 1
        if s < i + j :
            break
    if s < i :
        break
else :
    print ( str ( count ) , file = out )
