def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.argv.index ( 'N' )
        self.M = sys.argv.index ( 'M' )
        dp = [ 0 ] * ( N + 1 )
        sum = [ 0 ] * ( N + 1 )
        last = [ 0 ] * ( M + 1 )
        INF = 1000000007
        dp [ 0 ] = 1
        sum [ 0 ] = 1
        min = 0
        for i in range ( 1 , N + 1 ) :
            f = sys.argv.index ( i )
            min = max ( min , last [ f ] )
            if min > 0 :
                dp [ i ] = ( sum [ i - 1 ] - sum [ min - 1 ] + INF ) % INF
            else :
                dp [ i ] = sum [ i - 1 ]
            sum [ i ] = ( sum [ i - 1 ] + dp [ i ] ) % INF
            last [ f ] = i
        print ( dp [ N ] % INF )
