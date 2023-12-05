def import import _atoi
import sys
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        question = sc.readline ( ).split ( ) [ 0 ]
        answers = [ ]
        scores = [ sc.readline ( ).split ( ) [ 0 ] for i in range ( 4 ) ]
        for i in range ( 4 ) :
            for digit in range ( question ) :
                if int ( answers [ 0 ] [ digit ] ) == ( i + 1 ) :
                    scores [ i ] = scores [ i ] + 1
        max = scores [ 0 ]
        min = scores [ 1 ]
        for v in scores :
            if v > max :
                max = v
            if v < min :
                min = v
        print ( max , min )
