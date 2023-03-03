def _iter_range ( t , d ) : return _iter_range ( t , d )
class SupplyIterator ( Iterable ) :
    def __init__ ( self ) :
        self.t = t
    def solve ( self ) :
        n = self.g_int ( )
        a = [ ]
        for i in self.rep ( 1 , n ) :
            a.append ( self.g_int ( ) )
        res = 0
        r , xor = 0 , 0
        for l in self.rep ( 1 , n ) :
            while r < n and ( xor & a [ r + 1 ] == 0 ) :
                r += 1
                xor ^= a [ r ]
            res += r - l + 1
            xor ^= a [ l ]
        print ( res )
    def main ( self ) :
        super ( Main , self ).solve ( )
    def g_int ( self ) : return int ( self.s.next ( ) )
    def g_long ( self ) : return long ( self.s.next ( ) )
    def g_double ( self ) : return double ( self.s.next ( ) )
    def ints ( self ) : return _iter_range ( n , Main.g_int )
    def g_long ( self ) : return long ( self.s.next ( ) )
    def g_double ( self ) : return double ( self.s.next ( ) )
    def strs ( self ) : return _iter_range ( n , s.next ( ) )
    def rep ( self ) : return self.s.next ( )
    def f ( self , t , d ) : return self.f.next ( )
    def rep ( self , t , d ) : return self.s.next ( )
    def rrep ( self , t , d ) : return self.rrep ( t , t , d )
    def rep ( self , t , d ) : return self.s.next ( )
    def __iter__ ( self ) :
        return self.g_iter ( )
