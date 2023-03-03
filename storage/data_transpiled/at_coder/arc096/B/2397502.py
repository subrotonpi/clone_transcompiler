def import _sushi
class Sushi :
    def __init__ ( self , a , b ) :
        self.v = a
        self.x = b
    def main ( self ) :
        sc = _sushi.Scanner ( )
        N = sc.n
        C = sc.n
        ans = 0
        if N == 1 :
            position = sc.n
            value = sc.n
            distance = min ( position , C - position )
            if value > distance :
                print ( value - distance )
            else :
                print ( 0 )
            return
        al = [ Sushi ( sc.n , sc.n ) for i in range ( N ) ]
        al.sort ( key = lambda a : a.v )
        calL = [ al [ 0 ].v ]
        for i in range ( 1 , N ) : calL [ i ] = calL [ i - 1 ] + al [ i ].v
        for i in range ( N ) : calL [ i ] -= al [ i ].x
        calR = [ al [ N - 1 ].v ]
        for i in range ( N - 2 , - 1 , - 1 ) : calR [ i ] = calR [ i + 1 ] + al [ i ].v
        for i in range ( N - 1 , - 1 , - 1 ) : calR [ i ] -= ( C - al [ i ].x )
        maxL = [ max ( calL [ 0 ] , calL [ 1 ] ) for i in range ( N - 1 , - 1 , - 1 ) ]
        ans = max ( ans , maxL [ N - 1 ] )
    return Sushi
