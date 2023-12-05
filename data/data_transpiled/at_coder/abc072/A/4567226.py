def import import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( sys.stdin ).__init__ ( self )
    def __init__ ( self ) :
        Scanner ( sys.stdout ).__init__ ( self )
        self.N , T = map ( int , sys.stdin.readline ( ).split ( '\n' ) )
        if N - T > 0 :
            self.out.write ( str ( N - T ) )
        else :
            self.out.write ( 0 )
        self.out.flush ( )
