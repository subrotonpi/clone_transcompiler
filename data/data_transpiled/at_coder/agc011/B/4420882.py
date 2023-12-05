def import import sys
import time
import math
class Main ( object ) :
    def __init__ ( self ) :
        self.pos = - 1
        self.n = len ( sys.stdin )
        self.a = [ ]
        for i in range ( self.n ) :
            self.a.append ( sys.stdin.read ( ) )
        self.a.sort ( )
        for i in range ( self.n - 1 ) :
            self.a [ i + 1 ] += self.a [ i ]
            if self.a [ i ] * 3 < self.a [ i + 1 ] :
                pos = i
        print ( self.n - pos - 1 )
