def import _array_sort
import numpy
import numpy
import os
import numpy
class Main ( object ) :
    def __init__ ( self ) :
        Scanner = sys.stdin
        N = os.environ.get ( 'NPROC' , 1 )
        box = [ [ x [ 0 ] , x [ 1 ] ] for x in range ( N ) ]
        box = [ [ x [ 0 ] , x [ 1 ] ] for x in box ]
        box = sorted ( box , key = lambda x : x [ 1 ] )
        INF = 1000000000
        dp = [ INF ] * N + [ INF ]
        dpw = [ INF ] * N + [ INF ]
        for i in range ( N + 1 ) :
            result = numpy.searchsorted ( dp , box [ i ] [ 1 ] )
            insertionPoint = ( result >= 0 ) & ~ result
            dp [ insertionPoint ] = box [ i ] [ 1 ]
            dpw [ insertionPoint ] = box [ i ] [ 0 ]
        for i in range ( N ) :
            if dp [ i + 1 ] == INF :
                print ( i + 1 )
                break
class ArraySort ( object ) :
    def __init__ ( self , num1 , num2 ) :
        if num1 [ 0 ] == num2 [ 0 ] :
            return num2 [ 1 ] - num1 [ 1 ]
        return num1 [ 0 ] - num2 [ 0 ]
