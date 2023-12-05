def import import sys
import os
import sys
def solve ( ) :
    return solve ( )
def solve ( ) :
    with open ( sys.argv [ 1 ] , 'r' ) as sc :
        n = sc.read ( )
        k = sc.read ( )
        a = [ 0 ] * ( 200001 - k )
        for i in range ( n ) :
            a [ sc.read ( ) ] += 1
        a.sort ( )
        count = 0
        for i in range ( 200000 , 200000 - k , - 1 ) :
            count += a [ i ]
        print ( n - count )
