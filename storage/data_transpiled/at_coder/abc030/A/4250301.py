def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        a , b , c , d = sc.get ( 'a' ) , sc.get ( 'b' ) , sc.get ( 'c' ) , sc.get ( 'd' )
        if b / a == d / c :
            print ( 'DRAW' )
        elif b / a > d / c :
            print ( 'TAKAHASHI' )
        else :
            print ( 'AOKI' )
