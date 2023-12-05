def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        s = sc.next ( )
        length = len ( s )
        K = sc.__next__ ( )
        seen = set ( )
        for i in range ( 1 , K + 1 ) :
            for j in range ( 0 , length - i ) :
                seen.add ( s [ j : j + i ] )
    lst = sorted ( lst )
    print ( lst [ K - 1 ] )
