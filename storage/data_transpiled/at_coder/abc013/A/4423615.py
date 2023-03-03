def import _main
class Main ( object ) :
    def __init__ ( self , * args ) :
        sc = _main ( args )
        a = sc.next ( )
        c = a [ 0 ]
        print ( c - 'A' + 1 )
