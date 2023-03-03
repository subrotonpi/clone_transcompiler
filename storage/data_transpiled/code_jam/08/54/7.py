def import _sys
class DSmall ( object ) :
    P = 10007
    def __init__ ( self ) :
        self.N = 100
    def main ( self ) :
        for caseid in range ( 1 , N + 1 ) :
            H , W , R = _sys.argv [ 1 : 2 ]
            rock = np.zeros ( ( H , W , R ) )
            for i in range ( R ) :
                r , c = _sys.argv [ 1 : 2 ]
                rock [ r , c ] = True
            count = np.zeros ( ( H + 2 , W + 2 ) )
            count [ 0 , 0 ] = 1
            for y in range ( H ) :
                for x in range ( W ) :
                    if rock [ y , x ] :
                        continue
                    count [ y + 2 , x + 1 ] += count [ y , x ]
                    count [ y + 2 , x + 1 ] %= P
                    count [ y + 1 , x + 2 ] += count [ y , x ]
                    count [ y + 1 , x + 2 ] %= P
            print ( "Case #%d: %d" % ( caseid , count [ H - 1 , W - 1 ] ) )
