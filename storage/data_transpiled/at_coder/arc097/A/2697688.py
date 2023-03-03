def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        K = sc.next ( )
        length = len ( K )
        N = sc.__next__ ( )
        seen = set ( )
        for i in range ( 1 , N + 1 ) :
            for j in range ( 0 , length - i ) :
                seen.add ( K [ j : j + i ] )
    lst = sorted ( lst )
    print ( lst [ N - 1 ] )
