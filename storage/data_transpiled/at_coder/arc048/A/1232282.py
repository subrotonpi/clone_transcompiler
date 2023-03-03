def import _main
class Main ( object ) :
    def __init__ ( self ) :
        s = _main ( )
        f , t = s.split ( '.' )
        if f <= 0 and 0 <= t :
            t -= 1
        print ( t - f )
