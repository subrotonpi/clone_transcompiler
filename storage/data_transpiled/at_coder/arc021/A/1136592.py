def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        a = [ ]
        for i in range ( 4 ) :
            for j in range ( 4 ) :
                a.append ( sc.randint ( 0 , 4 ) )
        b = False
        for i in range ( 4 ) :
            for j in range ( 4 ) :
                if i != 3 and a [ i ] [ j ] == a [ i + 1 ] [ j ] :
                    b = True
                if j != 3 and a [ i ] [ j ] == a [ i ] [ j + 1 ] :
                    b = True
        if b :
            print ( "CONTINUE" )
        else :
            print ( "GAMEOVER" )
