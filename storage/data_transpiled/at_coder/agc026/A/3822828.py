def import import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.maxint
    def __call__ ( self , * args ) :
        sc = sys.stdin
        n = sc.n
        a = [ ]
        for i in range ( n ) :
            a.append ( sc.read ( ) )
        count = 0
        for i in range ( 1 , n ) :
            if a [ i ] == a [ i - 1 ] :
                count += 1
                i += 1
        print ( count )
