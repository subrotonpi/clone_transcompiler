def y2010.finals
import os
import sys
import sys
import random
import sys
import os
import sys
import sys
class A ( object ) :
    def __init__ ( self ) :
        self.a = [ ]
    def solve ( self ) :
        with open ( A.__name__ + '.in' , 'r' ) as infile :
            with open ( A.__name__ + '.out' , 'w' ) as outfile :
                self.a = [ ]
    T = len ( sys.argv )
    for i in range ( T ) :
        s = 'Case #%d: %s' % ( i + 1 , A ( ).solve ( ) )
        outfile.write ( s )
        print ( s )
def solve ( ) :
    s = sys.stdin.read ( )
    n = len ( s )
    a = [ s [ i ] - 'A' for i in range ( n ) ]
    mem = [ [ ] for _ in range ( n + 1 ) ]
    for ints in mem :
        for an_int in ints :
            [ an_int ] = - 1
    return '%d' % ( ( count ( 0 , n , a [ 0 ] ) + 1 ) * 2 + n )
def count ( l , r , c ) :
    if mem [ l ] [ r ] [ c ] >= 0 :
        return mem [ l ] [ r ] [ c ]
    res = 1000000
    if l >= r :
        res = 0
    elif a [ l ] == c :
        res = count ( l + 1 , r , c )
    elif a [ r - 1 ] == c :
        res = count ( l , r - 1 , c )
    else :
        cc = a [ l ]
        for j in range ( l , r ) :
            res = min ( res , 1 + count ( l , j + 1 , cc ) + count ( j + 1 , r , c ) )
    mem [ l ] [ r ] [ c ] = res
    return res
