def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        a = sc.randint ( 0 , 100 ) + sc.randint ( 0 , 100 )
        b = sc.randint ( 0 , 100 ) + sc.randint ( 0 , 100 )
        print ( ( a == b ) and "Balanced" or ( a > b ) and "Left" or "Right" )
