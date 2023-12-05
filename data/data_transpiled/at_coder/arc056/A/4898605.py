def import import _min
class Main ( ) :
    def __init__ ( self , * args , ** kwargs ) :
        s = _sys.stdin.read ( )
        a , b , k , l = s.split ( ' ' )
        print ( k / l * b + min ( k % l * a , b ) )
