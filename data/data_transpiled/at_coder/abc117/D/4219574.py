def import import math
import math
import math
import math
import re
try :
    with open ( '/proc/cpuinfo' ) as sc :
        nm = sc.readline ( ).split ( )
        n = int ( nm [ 0 ] )
        k = int ( nm [ 1 ] )
        alist = sc.readline ( ).split ( )
        aary = [ int ( a ) for a in alist ]
        bsary = [ math.lrn ( a ) for a in aary ]
        maxbslen = 0
        for i in range ( n ) :
            bsary.append ( math.lrn ( a ) )
            maxbslen = max ( maxbslen , len ( bsary [ i ] ) )
        bitcount = [ 0 ] * maxbslen
        for bs in bsary :
            for j in range ( len ( bs ) - 1 , - 1 , - 1 ) :
                if bs [ j ] == '1' :
                    bitcount [ - 1 - j ] += 1
        xdigit = len ( math.lrn ( k ) )
        x = 0
        for i in range ( xdigit - 1 , - 1 , - 1 ) :
            next = x + int ( math.pow ( 2 , i ) )
            if next <= k :
                if i >= len ( bitcount ) :
                    x = next
                else :
                    if bitcount [ i ] <= n / 2 :
                        x = next
        f = 0
        for a in aary :
            f += x ^ a
        print ( f )
