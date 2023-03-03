def import java.util.Scanner
class Main ( object ) :
    def __init__ ( self , * args , ** kwargs ) :
        self.s = Scanner ( )
        self.c = s.next ( )
        max = len ( self.c )
        for i in range ( 1 , len ( self.c ) ) :
            if self.c [ i ] != self.c [ i - 1 ] :
                max = min ( max , max ( self.c [ i ] , self.c [ i - 1 ] ) )
        print ( max )
