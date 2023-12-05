def import import sys , pickle , dump
from numpy.core.compatibility import builtins
import numpy
import random
import sys
class Main ( object ) :
    def __init__ ( self , f , x , p ) :
        self.f = f
        self.p = x + p / pow ( 2 , x * 2 / 3 )
    def solve ( self ) :
        p = self.p
        l , r = 0.0 , int ( p ) / 2
        for i in range ( 100 ) :
            s , t = ( l * 2 + r ) / 3 , ( l + r * 2 ) / 3
            if f ( s , p ) < f ( t , p ) :
                r = t
            else :
                l = s
        self.f.write ( "%.10f\n" % ( f ( ( l + r ) * 0.5 , p ) ) )
    def main ( self ) :
        self.debug = sys.flags.debug
        start = time.clock ( )
        self.solve ( )
        sys.stdout.flush ( )
        end = time.clock ( )
        dump ( ( "%.10f ms" % ( end - start ) / 1000000 ) )
        sys.stdout.flush ( )
    def dump ( * o ) :
        if self.debug :
            print ( " ".join ( map ( str , o ) ) , file = sys.stderr )
