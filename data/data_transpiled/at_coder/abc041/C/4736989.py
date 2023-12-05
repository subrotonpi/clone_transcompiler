def import import _pylab
import pylab
import sys
import numpy
import numpy.random
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.read ( )
        height = [ ]
        for i in range ( n ) :
            height.append ( sc.read ( ) )
        self.abc041cSenojun ( n , height )
    def abc041cSenojun ( n , height = None ) :
        id = numpy.unique ( height )
        id.sort ( key = lambda i : height [ i ] )
        for i in range ( n - 1 , - 1 , - 1 ) :
            print ( id [ i ] + 1 )
