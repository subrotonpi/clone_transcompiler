def _import ( ) : return _r_int ( )
def _str_of_ints ( n ) : return _r_str ( )
def _r_int ( ) : return _r_int ( )
def _r_long ( ) : return _r_long ( )
def _r_double ( ) : return _r_double ( )
class Main ( ) :
    def solve ( self ) :
        n , a = self.g_int ( ) , [ ]
        self.a = [ i for i in self.a if i == n ]
        for q , next in self.rep ( gInt ( ) ) :
            for i in self.rep ( n + 1 ) :
                if a [ i ] == next :
                    t = a [ i ]
                    self.a [ i ] = a [ 0 ]
                    a [ 0 ] = t
                    break
        a.append ( next )
        return a
    def main ( self ) :
        return Main ( ).solve ( )
    def s ( self ) :
        return _r_int ( )
    def g_int ( ) :
        return int ( )
    def g_long ( ) :
        return long ( )
    def g_float ( ) :
        return float ( )
    def rep ( self , i ) :
        return range ( i )
    def f ( self , t , d ) :
        return range ( f , t , d )
    def rep ( self , f , t ) :
        return range ( f , t , 1 )
    def rrep ( self , f , t ) :
        return range ( f , t , - 1 )
    class Range ( Iterable ) :
        def __init__ ( self , iterable ) :
            self.to , cur , d = iterable
            self.from operator import itemgetter
            self.cur = - self.d , self.to
            self.d = d
        def __iter__ ( self ) :
            return self
        def next ( self ) :
            return cur + self.d
    def _reps ( self , v ) :
        return range ( v )
