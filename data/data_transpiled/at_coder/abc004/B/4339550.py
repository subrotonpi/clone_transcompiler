def import _Scanner
class Main ( object ) :
    def __init__ ( self ) :
        sc = _Scanner ( )
        for i in range ( 4 ) :
            for j in range ( 4 ) :
                s [ i ] [ j ] = sc.next ( )
        for i in range ( 3 , - 1 , - 1 ) :
            for j in range ( 3 , - 1 , - 1 ) :
                print ( s [ i ] [ j ] , end = ' ' )
                if j != 0 :
                    print ( ' ' , end = ' ' )
            print ( )
