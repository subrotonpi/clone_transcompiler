def import import math
class Main ( object ) :
    def __init__ ( self , a , b , k , l ) :
        Scanner ( ).__init__ ( a , b , k , l )
        ans = k / l * b
        k -= k / l * l
        print ( ans , ( k , min ( k * a , b ) ) )
