def import import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin
        self.k = sys.argv.pop ( 0 )
        a = 1
        b = 1
        for i in range ( self.k ) :
            nextA , nextB = a + b , a
            a , b = nextA , nextB
        print ( a , b )
