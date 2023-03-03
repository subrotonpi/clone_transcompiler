def import sc
import string
import sys
import string
import math
import string
import string
import math
import string
import string
import struct
import struct
import struct
import sys
n = sc.__next__ ( )
pf = { }
for i in range ( 1 , n + 1 ) :
    s = int ( sqrt ( n ) ) + 1
    t = i
    for j in range ( 2 , s + 1 ) :
        while t % j == 0 :
            pf [ j ] = pf.get ( j , 0 ) + 1
            t /= j
    if t != 1 :
        pf [ t ] = pf.get ( t , 0 ) + 1
p = [ ]
c = 0
for key in pf :
    p.append ( pf [ key ] )
ans = 0
for i in range ( 25 ) :
    if p [ i ] + 1 >= 75 :
        ans += 1
for i in range ( 25 ) :
    for j in range ( 25 ) :
        if i == j :
            continue
        if p [ i ] + 1 >= 3 and p [ j ] + 1 >= 25 :
            ans += 1
        if p [ i ] + 1 >= 5 and p [ j ] + 1 >= 15 :
            ans += 1
for i in range ( 25 ) :
    for j in range ( 25 ) :
        for k in range ( 25 ) :
            if i == j or j == k or k == i :
                continue
            if p [ i ] + 1 >= 3 and p [ j ] + 1 >= 5 and p [ k ] + 1 >= 5 and j > k :
                ans += 1
print ( ans )
print ( )
print ( '\n' )
