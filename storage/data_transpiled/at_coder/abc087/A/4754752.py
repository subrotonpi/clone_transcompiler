def import import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        a = int ( self.sc.read ( ) )
        b = int ( self.sc.read ( ) )
        c = int ( self.sc.read ( ) )
        a = a - b
        for _ in range ( 1 , 5 ) :
            a -= c
            if a < c :
                break
        print ( a )
