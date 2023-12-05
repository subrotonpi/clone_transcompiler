def import import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.found = False
    def __call__ ( self , * args , ** kwargs ) :
        sc = sys.stdin
        a = sc.read ( )
        b = sc.read ( )
        x = sc.read ( )
        if a % x :
            a += x - ( a % x )
        if a > b :
            print ( '0' )
            return
        ans = ( ( b - a ) // x ) + 1
        print ( ans )
