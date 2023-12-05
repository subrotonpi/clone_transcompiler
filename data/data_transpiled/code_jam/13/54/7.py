def _import ( ) : return ( ( set >> bit ) & 1 ) == 1
class D ( object ) :
    def __init__ ( self , n , used ) :
        DP = [ [ 1 << 20 ] ]
        def f ( self , n , used ) :
            if used == ( 1 << n ) - 1 : return 0
            if self in DP : return DP [ self ] [ n ] [ used ]
            ans = 0
            for nxt in self.n :
                money = self.n
                while self.bit_set ( used , nxt ) :
                    nxt = ( nxt + 1 ) % self.n
                    money -= 1
                ans += 1.0 / n * ( money + f ( self , n , used | 1 << nxt ) )
            return DP [ self ] [ n ] [ used ] = ans
    def main ( ) :
        with open ( "/proc/stdin" , "r" ) as f :
            T = f.read ( )
            for cas in range ( 1 , T + 1 ) :
                S = f.read ( ).decode ( )
                used = 0
                for i in range ( len ( S ) ) :
                    if S [ i ] == 'X' : used |= 1 << i
                print ( "Case #%d: %.10f\n" % ( cas , f ( len ( S ) , used ) ) )
