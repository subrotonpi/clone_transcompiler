def import _np
import _np
import _np
import _np
import _np
import _np
import _np
class Main :
    def __init__ ( self , v ) :
        self.v = v
    def REPS ( self , l , r ) :
        return _np.arange ( l , r )
    def INS ( self , n ) :
        return _np.arange ( self.n )
    def get_int ( self ) :
        return int ( self.s.readline ( ) )
    def n , m , l = get_int ( ) , get_int ( ) , get_int ( )
    def main ( self , * args , ** kwargs ) :
        p , q , r = self.p , self.q , self.r
        print ( np.sum ( [ hoge ( p , q , r ) , hoge ( p , r , q ) , hoge ( q , p , r ) , hoge ( q , r , p ) , hoge ( r , p , q ) , hoge ( r , q , p ) ] ).max ( ).astype ( int ) )
    def hoge ( self , p , q , r ) :
        return ( self.n // p ) * self.m // q
