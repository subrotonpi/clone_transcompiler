def import _main
class Main ( object ) :
    def __init__ ( self , * args , ** kwargs ) :
        self.c = _main ( args , kwargs )
        l , x , y , s , d = self.c.split ( )
        print ( s == d , min ( ( d - s + ( d > s ) ) / ( y + x ) , ( s - d + ( d > s ) ) / max ( y - x , 0 ) ) )
