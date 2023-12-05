def _import ( ) : return ( n / x ) * ( m / y ) * ( l / z )
class Main :
    def __init__ ( self , s ) :
        self.s = s
        self.getInt = int ( self.s )
    @ safe_function
    def ofAll ( funk , * a ) :
        t = a [ 0 ]
        for i in a [ 1 : ] :
            t = funk ( t , i )
        return t
    n , m , l , p , q , r = int ( ) , int ( ) , int ( ) , int ( ) , int ( ) , int ( )
    def main ( * args , ** kwargs ) :
        print ( ofAll ( max , solve ( p , q , r ) , solve ( p , r , q ) , solve ( q , p , r ) , solve ( q , r , p ) , solve ( r , p , q ) , solve ( r , q , p ) ) )
    def solve ( x , y , z ) :
        return ( n / x ) * ( m / y ) * ( l / z )
