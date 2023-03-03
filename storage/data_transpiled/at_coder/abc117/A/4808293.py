def import import sys
import numpy
from numpy.core import get_symbols
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys._getframe ( 1 )
        t = sc.f_asnumpy ( )
        x = sc.f_asnumpy ( )
        print ( t / x )
        self._eval ( )
