def import _scanner
class Main ( Scanner ) :
    def __init__ ( self ) :
        sc = Scanner ( )
        a , b , c , d = sc.next ( ) , sc.next ( ) , sc.next ( ) , sc.next ( )
        print ( max ( min ( b , d ) - max ( a , c ) , 0 ) )
