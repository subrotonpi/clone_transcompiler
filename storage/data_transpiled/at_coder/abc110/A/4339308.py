def import _scanner
class Main ( Scanner ) :
    def __init__ ( self ) :
        sc = Scanner ( )
        a , b , c = sc.next ( )
        print ( max ( max ( a * 10 + b + c , a + b * 10 + c ) , a + b + c * 10 ) )
