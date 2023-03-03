def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( ).__init__ ( self )
    N = sys.argv [ 1 ]
    dp = [ 0 ] * ( N + 1 )
    for i in range ( 1 , N + 1 ) :
        dp [ i ] = sys.maxint
        power = 1
        while power <= i :
            dp [ i ] = min ( 1 + dp [ i - power ] , dp [ i ] )
            power *= 6
        power = 1
        while power <= i :
            dp [ i ] = min ( 1 + dp [ i - power ] , dp [ i ] )
            power *= 9
    print ( dp [ N ] )
