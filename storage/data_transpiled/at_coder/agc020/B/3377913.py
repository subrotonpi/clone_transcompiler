def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( ).strip ( )
        A = [ sc.readline ( ).strip ( ) for i in range ( 1 , N + 1 ) ]
        min = 2
        max = 2
        for i in range ( N , 1 , - 1 ) :
            if min % A [ i ] != 0 :
                min = min // A [ i ] * A [ i ] + A [ i ]
            max = max // A [ i ] * A [ i ] + A [ i ] - 1
            if min > max :
                print ( - 1 )
                sys.exit ( )
        print ( str ( min ) , str ( max ) )
