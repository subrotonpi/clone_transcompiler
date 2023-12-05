def import _warshall_floyd
class Main ( object ) :
    def __init__ ( self , dist ) :
        sc = sys.stdin
        H , W = sc.read ( ).split ( ' ' )
        c = [ ]
        dist = [ ]
        for i in range ( 10 ) :
            [ dist.append ( i ) for i in range ( 10 ) ]
        for i in range ( 10 ) :
            for j in range ( 10 ) :
                c [ i ] [ j ] = sc.read ( ).split ( ' ' )
                dist [ i ] [ j ] = c [ i ] [ j ]
    A = np.array ( [ [ 0 ] * H + [ 1 ] * W + [ 0 ] * W + [ 1 ] * W + [ 0 ] * W + [ 1 ] * W + [ 1 ] * W + [ 0 ] * W + [ 1 ] * W + [ 1 ] * W + [ 0 ] * W + [ 1 ] * W + [ 1 ] * W + [ 1 ] * W + [ 0 ] * W + [ 1 ] * W + [ 1 ] * W + [ 1 ] * W + [ 1 ] * W + [ 1 ] * W + [ 1 ] * W + [ 1 ] * W + [ 1 ] * W + [ 1 ] * W + [ 1 ] * W + [ 1 ] * W + [ 1 ] * W + [ 1 ] * W + [ 1 ] * W + [ 1 ] * W + [ 1 ] * W + [ 1 ] * W + [ 1 ] * W + [ 1 ] * W + [ 1 ] * W + [ 1 ] * W + [ 1 ] * W + [ 1 ] * W + [ 1 ] * W + [ 1 ] * W + [ 1 ] * W + [ 1 ] * W + [ 1 ] * W + [ 1 ] * W + [ 1 ] * W + [ 1 ] * W + [ 1 ] * W + [ 1 ] * W + [ 1 ] * W + [ 1 ] * W + [ 1 ] * W + [ 1 ] * W + [ 1 ] * W + [ 1 ] * W + [ 1 ] * W + [ 1 ] * W + [ 1 ] * W + [ 1 ] * W + [ 1 ]
