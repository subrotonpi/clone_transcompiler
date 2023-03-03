def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        a = sc.split ( '' , 1 )
        print ( 'Yes' if ( a [ 0 ] == a [ 1 ] and a [ 2 ] == a [ 1 ] or a [ 1 ] == a [ 2 ] and a [ 3 ] == a [ 2 ] ) else 'No' )
