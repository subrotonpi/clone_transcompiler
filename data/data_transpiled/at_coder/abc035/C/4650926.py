def import _decimal
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.randint ( 0 , N )
        Q = sc.randint ( 0 , Q )
        stones = [ 0 ] * ( N + 1 )
        for i in range ( Q ) :
            start = sc.randint ( 0 , N - 1 )
            end = sc.randint ( 0 , Q - 1 )
            stones [ start ] += 1
            stones [ end ] += - 1
        for i in range ( N ) :
            if i > 0 :
                stones [ i ] += stones [ i - 1 ]
        stones = [ '0' if i % 2 == 0 else '1' for i in range ( N ) ]
        print ( ' '.join ( stones ) )
