def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        s = sc.next ( )
        k = sc.__next__ ( )
        if len ( s ) < k :
            print ( 0 )
            return
        seen = set ( )
        for i in range ( 0 , len ( s ) - k ) :
            sub = s [ i : i + k ]
            seen.add ( sub )
        print ( len ( seen ) )
