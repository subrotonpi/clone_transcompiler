def import min
import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        self.a , self.b , self.c , self.d = map ( int , sys.stdin.read ( ).split ( '\n' ) )
        self.min_1 = min ( self.a , self.b )
        self.min_2 = min ( self.c , self.d )
        self.print ( self.min_1 + self.min_2 )
        self.sc.close ( )
