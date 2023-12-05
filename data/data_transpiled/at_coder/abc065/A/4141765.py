def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        x = sc.x
        a = sc.a
        b = sc.b
        if a >= b :
            print ( "delicious" )
        elif b - a <= x :
            print ( "safe" )
        else :
            print ( "dangerous" )
