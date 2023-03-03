def import __main__
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        a = [ ]
        for y in range ( 4 ) :
            for x in range ( 4 ) :
                a.append ( sc.read ( ) )
        dx = [ - 1 , 0 , 1 , 0 ]
        dy = [ 0 , 1 , 0 , - 1 ]
        for y in range ( 4 ) :
            for x in range ( 4 ) :
                for i in range ( 4 ) :
                    ny = y + dy [ i ]
                    nx = x + dx [ i ]
                    if nx < 0 or nx > 3 or ny < 0 or ny > 3 :
                        continue
                    if a [ y ] [ x ] == a [ ny ] [ nx ] :
                        self.__main__.write ( "CONTINUE" )
                        return
        self.__main__.write ( "GAMEOVER" )
