def import import math
import os
import sys
import math
import math
class Main ( object ) :
    def __init__ ( self ) :
        self.f = sys.stdin
        self.n = int ( self.n )
        self.x , self.y = [ ] , [ ]
        for line in self.f :
            s = line.split ( )
            self.x.append ( int ( s [ 0 ] ) )
            self.y.append ( int ( s [ 1 ] ) )
    def __repr__ ( self ) :
        return "%s %s" % ( self.n , self.x )
