def import import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( )
        self.out = sys.stdout
        A = int ( self.out.get ( 'A' , 0 ) )
        B = int ( self.out.get ( 'B' , 0 ) )
        C = int ( self.out.get ( 'C' , 0 ) )
        self.out.write ( ( A + B ) * C / 2 )
        self.out.flush ( )
