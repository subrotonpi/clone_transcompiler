def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        n = sc.__next__ ( )
        k = sc.__next__ ( )
        d = defaultdict ( int )
        for i in range ( n ) :
            temp , num = _main ( )
            d [ temp ] = d.get ( temp , 0 ) + num
        for k , v in d.items ( ) :
            k -= v
            if k <= 0 :
                print ( k )
                return
