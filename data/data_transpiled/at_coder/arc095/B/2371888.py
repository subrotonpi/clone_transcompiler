def import import min
import sys
class Main ( object ) :
    def __init__ ( self ) :
        import sys
        sys.stdout.write ( "\n" )
    def __call__ ( self , * args ) :
        import random
        n = random.randint ( 1 , 10000 )
        a = [ random.choice ( args ) for i in range ( n ) ]
        a.sort ( )
        m = a [ n - 1 ]
        ans = - 1
        for i in range ( n - 1 ) :
            d = min ( a [ i ] , m - a [ i ] )
            if d > ans :
                ans = a [ i ]
        print ( m , ans )
