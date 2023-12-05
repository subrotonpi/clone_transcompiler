def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        k = int ( sc.readline ( ) )
        ak = [ int ( i ) for i in sc.readline ( ).split ( ) ]
        sc.close ( )
        min = 2
        max = 3
        for i in range ( k - 1 , - 1 , - 1 ) :
            if ( max - 1 ) / ak [ i ] <= ( min - 1 ) / ak [ i ] :
                print ( - 1 )
                return
            min = ak [ i ] * ( ( min - 1 ) / ak [ i ] + 1 )
            max = ak [ i ] * ( ( max - 1 ) / ak [ i ] + 1 )
        print ( min , max - 1 )
