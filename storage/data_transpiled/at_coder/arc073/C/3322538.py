def _import ( ) : return sys.stdin.read ( )
import readline
import readline
import readline
import readline
import readline
import readline
import sys
class Main ( ) :
    def __init__ ( self ) :
        fc = readline
        N = fc.readline ( )
        B = [ ]
        for i in range ( N ) :
            x , y = fc.readline ( )
            B.append ( ( i , x , y ) )
            B.reset ( )
        print ( self.__next__ )
    def __next__ ( self ) :
        return int ( self.__next__ )
    def solve ( self ) :
        if self.N == 1 :
            return long ( self.B [ 0 ] [ 1 ] ) * ( self.B [ 0 ] [ 0 ] [ 0 ] - self.B [ 0 ] [ 0 ] [ 0 ] )
        min = int ( self.__next__ )
        max = - 1
        for i in range ( self.N ) :
            if min > B [ i ] [ 0 ] :
                min = B [ i ] [ 0 ]
            if max < B [ i ] [ 1 ] :
                max = B [ i ] [ 1 ]
        return min , max , min
    def case_min_is_other_size ( min , max ) :
        [ B , ymin ] = min
        ymax = - 1
        for i in range ( self.N - 1 ) :
            box = B [ i ]
            ymax = max ( ymax , box [ 1 ] )
            ymin = min ( ymin , box [ 1 ] )
            ans = min ( long ( max ( B [ i - 1 ] [ 0 ] , ymax ) - min ( B [ i + 1 ] [ 0 ] , ymin ) ) * ( max - min ) , ans )
        ymax = max ( ymax , B [ i - 1 ] [ 1 ] )
        ymin = min ( ymax , ymin )
        ans = min ( long ( max ( B [ i ] [ 0 ] , ymax ) ) , ans )
        return ans
