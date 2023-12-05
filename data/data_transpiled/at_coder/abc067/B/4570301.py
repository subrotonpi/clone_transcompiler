def import import _np
import sys
import numpy
import numpy
from numpy.core import loadtxt
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.readline ( ).strip ( )
        self.K = sys.stdin.readline ( ).strip ( )
        num = [ ]
        for i in range ( N ) :
            num.append ( sys.stdin.readline ( ).strip ( ) )
        num.sort ( reverse = True )
        sum = 0
        for i in range ( K ) :
            sum += num [ i ]
        print ( sum )
