def import _main
class Main ( object ) :
    def __init__ ( self , * args , ** kwargs ) :
        self.l , x , y , s , d = args
        print ( s == d , min ( ( d - s + ( d > s ) ) / ( y + x ) , ( s - d + ( d > s ) ) / max ( y - x , 0 ) ) )
