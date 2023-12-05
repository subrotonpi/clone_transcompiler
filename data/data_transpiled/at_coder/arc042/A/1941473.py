def import _deque
import collections
import deque
import os
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( ).split ( ) [ 1 ]
        m = sc.readline ( ).split ( ) [ 0 ]
        a = [ False ] * n
        d = deque ( )
        for i in range ( m ) :
            b = sc.readline ( ).split ( ) [ 1 ]
            d.append ( b )
        while not d.empty ( ) :
            c = d.popleft ( )
            if not a [ c - 1 ] :
                a [ c - 1 ] = True
                print ( c )
        for i in range ( n ) :
            if not a [ i ] : print ( i + 1 )
