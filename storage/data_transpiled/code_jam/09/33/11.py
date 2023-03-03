def import import os , sys , traceback
import time
import sys
import os
import sys
import time
MAX = 100000
def rec ( i , j ) :
    if i > j : return 0
    if j in h [ i ] : return h [ i ] [ j ]
    l = - 1
    for k in range ( nq ) :
        if q [ k ] >= i and q [ k ] <= j :
            l = k
            break
    ret = 0
    if l != - 1 :
        ret = MAX
        for k in range ( l , nq , j ) :
            ret = min ( ret , j - i + rec ( i , q [ k ] - 1 ) + rec ( q [ k ] + 1 , j ) )
        h [ i ] [ j ] = ret
        return ret
def run ( ) :
    with open ( 'small.in' , 'r' ) as infile :
        with open ( 'small.out' , 'w' ) as outfile :
            pass
    test = sys.stdin.read ( )
    for nt in range ( 1 , test + 1 ) :
        p = sys.stdin.read ( )
        nq = sys.stdin.read ( )
        q = [ sys.stdin.read ( ) ]
        for i in range ( nq ) :
            q.append ( sys.stdin.read ( ) )
        q = [ sys.stdin.read ( ) ]
        h = { }
        for i in range ( 1 , p + 1 ) :
            h [ i ] = { }
        ret = rec ( 1 , p )
        print ( "Case #%d: %d" % ( nt , ret ) , file = outfile )
