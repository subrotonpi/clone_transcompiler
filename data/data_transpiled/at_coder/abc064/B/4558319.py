def import import sys
import time
import numpy
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.maxint
    def __call__ ( self , * args ) :
        a = [ ]
        for i in range ( len ( args ) ) :
            a.append ( args [ i ] )
        a.sort ( )
        print ( a [ - 1 ] - a [ 0 ] )
