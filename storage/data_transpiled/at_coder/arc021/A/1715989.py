def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        a = [ ]
        for i in range ( 4 ) :
            for j in range ( 4 ) :
                a.append ( sc.randint ( 0 , 4 ) )
        for i in range ( 4 ) :
            for j in range ( 3 ) :
                if a [ i ] [ j ] == a [ i ] [ j + 1 ] :
                    print ( "CONTINUE" )
                    return
        for i in range ( 3 ) :
            for j in range ( 4 ) :
                if a [ i ] [ j ] == a [ i + 1 ] [ j ] :
                    print ( "CONTINUE" )
                    return
        print ( "GAMEOVER" )
