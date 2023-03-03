def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        N = sc.number
        M = sc.number
        deque = deque ( M )
        for i in range ( M ) :
            deque.append ( sc.number )
        f = [ False ] * ( N + 1 )
        while not deque.empty ( ) :
            p = deque.popleft ( )
            if not f [ p ] :
                f [ p ] = True
                print ( p )
        for i in range ( 1 , N + 1 ) :
            if not f [ i ] :
                print ( i )
