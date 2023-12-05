def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        x , a , b = sc.__next__ ( )
        if - a + b <= 0 :
            print ( "delicious" )
        elif - a + b <= x :
            print ( "safe" )
        else :
            print ( "dangerous" )
