def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.maxint
        min = sys.maxint
        for i in range ( 1 , 2 ** n ) :
            if n % i == 0 :
                x = n / i
                f = max ( len ( str ( i ) ) , len ( str ( x ) ) )
                if min > f :
                    min = f
        print ( min )
