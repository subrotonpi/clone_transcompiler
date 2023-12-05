def import import sys
import os
import sys
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = 0
        self.b = 0
        self.x = 0
        try :
            with open ( sys.argv [ 1 ] ) as f :
                tmp = f.readline ( ).split ( 's' )
                a = int ( tmp [ 0 ] )
                b = int ( tmp [ 1 ] )
                x = int ( tmp [ 2 ] )
        except IOError :
            sys.exit ( 1 )
    def sum ( self ) :
        return ( b // self.x ) + 1
    def diff ( self ) :
        if self.a % self.x == 0 :
            diff -= 1
        sys.stdout.write ( sum ( self ) - diff )
