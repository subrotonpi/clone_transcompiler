def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        a , b = sc.split ( )
        mod = a % b
        print ( b - mod if mod != 0 else 0 )
