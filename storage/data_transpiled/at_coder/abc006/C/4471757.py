def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        s = sc.readline ( ).split ( )
        N = int ( s [ 0 ] )
        M = int ( s [ 1 ] )
        for i in [ 0 , 1 ] :
            for j in [ 0 , N - i ] :
                k = N - i - j
                if ( i * 3 ) + ( j * 2 ) + ( k * 4 ) == M :
                    print ( j , i , k )
                    sys.exit ( )
        print ( "-1 -1 -1" )
