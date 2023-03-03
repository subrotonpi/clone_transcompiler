def import import sys , time
import math
import random
import time
import sys
import math
import random
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.f = sys.stdin
        self.f = sys.stdout
        self.debug = False
        self.s = 0
        self.d = 0
        if self.s < self.d :
            if self.x < self.y :
                self.f.write ( "%.10f\n" % min ( ( self.d - s ) / ( self.x + self.y ) , ( self.l - ( self.d - self.s ) ) / ( self.y - self.x ) ) )
            else :
                self.f.write ( "%.10f\n" % ( self.d - s ) / ( self.x + self.y ) )
        elif self.s > self.d :
            if self.x < self.y :
                self.f.write ( "%.10f\n" % min ( ( self.l - self.s - self.d ) / ( self.x + self.y ) , ( self.s - self.d ) / ( self.y - self.x ) ) )
            else :
                self.f.write ( "%.10f\n" % ( self.l - self.s - self.d ) )
        else :
            self.f.write ( "0" )
    def main ( self ) :
        self.debug = self.debug
        start = time.clock ( )
        self.solve ( )
        self.f.flush ( )
        end = time.clock ( )
        self.dump ( ( end - start ) / 1000000 + " ms" )
        self.f.flush ( )
        self.f.flush ( )
        end = time.clock ( )
        self.dump ( ( end - start ) / 1000000 + " ms" )
        self.f.flush ( )
    def dump ( * x ) :
        if self.debug :
            print ( * x , end = end )
