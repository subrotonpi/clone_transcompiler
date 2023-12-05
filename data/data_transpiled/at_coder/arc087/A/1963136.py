def import _intlist
import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( ).__init__ ( self )
        N = sys.stdin.read ( )
        a = _intlist ( N )
        d = { }
        for i in range ( N ) :
            if i not in d :
                d [ i ] = 0
            d [ i ] = d [ i ] + 1
    ans = 0
    for i , j in d.items ( ) :
        if i > j :
            ans += j
        else :
            ans += j - i
    print ( ans )
