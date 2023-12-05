def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        s = sc.next ( )
        val = 0
        for i in range ( 4 ) :
            if s [ i ] == '+' :
                val += 1
            else :
                val -= 1
        print ( val )
