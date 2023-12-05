def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        n = int ( sc.get ( 'a' , 0 ) + sc.get ( 'b' , 0 ) )
        print ( n * 2 )
