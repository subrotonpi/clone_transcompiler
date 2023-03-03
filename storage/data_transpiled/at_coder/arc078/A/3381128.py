def import import math
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
    def __call__ ( self , * args ) :
        a = [ ]
        sum = 0
        for i in range ( n ) :
            a.append ( math.factorial ( a [ i ] ) )
            sum += a [ i ]
        self.n = int ( n )
        ans = float ( 'inf' )
        x = 0
        for i in range ( n - 1 ) :
            x += a [ i ]
            dif = abs ( ( sum - x ) - x )
            if dif < ans :
                ans = dif
        print ( ans )
