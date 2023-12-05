def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        a = sc.randint ( 0 , 100 )
        b = sc.randint ( 0 , 100 )
        x = sc.randint ( 0 , 100 )
        print ( a == 0 and b / x + 1 or b / x - ( a - 1 ) / x )
