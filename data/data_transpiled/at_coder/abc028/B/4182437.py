def import _Scanner
class Main ( object ) :
    def __init__ ( self ) :
        sc = _Scanner ( )
        s = sc.next ( )
        count = [ 0 ] * 6
        for c in s :
            count [ c - 'A' ] += 1
        print ( count [ 0 ] , count [ 1 ] , count [ 2 ] , count [ 3 ] , count [ 4 ] , count [ 5 ] )
