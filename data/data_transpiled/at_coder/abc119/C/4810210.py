def _import ( ) : return _import ( )
from time import sleep
class Main ( object ) :
    def __init__ ( self ) :
        self.N , self.A , self.B , self.C = sys._getframe ( 1 ).f_code.co_name
        self.take = [ ]
        for i in range ( self.N ) :
            self.take.append ( i )
    def calmp ( self , n , a , b , c ) :
        if n == self.N :
            return ( abs ( A - a ) + abs ( B - b ) + abs ( C - c ) - 30 ) if min ( min ( a , b ) , c ) > 0 else 30000
        mp0 = calmp ( self.n + 1 , a , b , c )
        mp1 = calmp ( self.n + 1 , a + take [ n ] , b , c ) + 10
        mp2 = calmp ( self.n + 1 , a , b + take [ n ] , c ) + 10
        mp3 = calmp ( self.n + 1 , a , b , c + take [ n ] ) + 10
        return min ( min ( mp0 , mp1 ) , min ( mp2 , mp3 ) )
