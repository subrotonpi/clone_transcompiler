def _import ( ) : return
import sys
import random
import string
import sys
import random
import sys
import sys
import os
import getopt
try :
    f = open ( '/dev/null' , 'w' )
except :
    sys.stderr = sys.stderr
    print ( '/dev/null' )
    return
tests = randint ( 1 , 2 )
for test in range ( 1 , tests + 1 ) :
    solve ( )
ans = 0
dyn = [ 0 ] * ( k + 1 )
for left in range ( 0 , k ) :
    right = k - left
    fill ( dyn , 0 )
    dyn [ 0 ] = 1
    for i in range ( left ) :
        cp , cq = p [ i ] , 1 - cp
        for j in range ( i + 1 , 0 , - 1 ) :
            dyn [ j ] = dyn [ j ] * cq + dyn [ j - 1 ] * cp
        dyn [ 0 ] = dyn [ 0 ] * cq
    for i in range ( left , k ) :
        cp , cq = p [ i - left + n - right ] , 1 - cp
        for j in range ( i + 1 , 0 , - 1 ) :
            dyn [ j ] = dyn [ j ] * cq + dyn [ j - 1 ] * cp
        dyn [ 0 ] = dyn [ 0 ] * cq
    sum = 0
    for i in range ( 0 , k ) :
        sum += dyn [ i ]
    ans = max ( ans , dyn [ k // 2 ] / sum )
