def import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        self.out = sys.stdout
        self.N = int ( self.sc.n )
        A = int ( self.sc.n )
        B = int ( self.sc.n )
        if A >= B :
            self.out.write ( 'delicious\n' )
        elif N >= ( B - A ) :
            self.out.write ( 'safe\n' )
        elif N < ( B - A ) :
            self.out.write ( 'dangerous\n' )
        self.out.flush ( )
