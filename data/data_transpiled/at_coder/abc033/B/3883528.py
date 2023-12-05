def import _atcoder
class Main ( object ) :
    def __init__ ( self ) :
        sc = _atcoder ( )
        N = sc.count ( ' ' )
        S = [ ]
        P = [ ]
        sum = 0
        for i in range ( N ) :
            S.append ( sc.get ( ' ' ) )
            P.append ( sc.get ( ' ' ) )
            sum += P [ i ]
        for i in range ( N ) :
            if sum / 2 < P [ i ] :
                print ( S [ i ] )
                return
        print ( 'atcoder' )
