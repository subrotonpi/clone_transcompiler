def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.solve ( )
    def solve ( self ) :
        sc = sys.stdin
        l , h , n = map ( int , sc.readlines ( ) )
        a = [ int ( i ) for i in sc.split ( ' ' ) ]
        sc.close ( )
        for i in range ( n ) :
            if h < a [ i ] :
                print ( - 1 )
                continue
            if l > a [ i ] :
                print ( l - a [ i ] )
            else :
                print ( 0 )
