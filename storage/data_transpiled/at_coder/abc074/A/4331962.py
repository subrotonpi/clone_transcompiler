def import import _sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = _sys.stdin
        print ( int ( sum ( [ x ** 2 for x in range ( 1 , len ( x ) ) ] ) ) - sc.tell ( ) )
