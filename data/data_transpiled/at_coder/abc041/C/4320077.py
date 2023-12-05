def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        n = sc.__next__ ( )
        a = [ ]
        pairs = [ ]
        for i in range ( n ) :
            a.append ( sc.__next__ ( ) )
            pairs.append ( ( i , a [ i ] ) )
        pairs.sort ( )
        for i in range ( n - 1 , - 1 , - 1 ) :
            print ( pairs [ i ] + 1 )
