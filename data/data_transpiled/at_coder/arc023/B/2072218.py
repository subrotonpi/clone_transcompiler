def import __main__
class Main ( object ) :
    def __init__ ( self , * args , ** kwargs ) :
        s = raw_input ( )
        h , w , d , r = s.split ( )
        for i in range ( h ) :
            for j in range ( w ) :
                r = max ( r , s.split ( ) [ i ] * ( ( i + j <= d and ( d - i - j ) % 2 == 0 ) or 1 ) )
        print ( r )
