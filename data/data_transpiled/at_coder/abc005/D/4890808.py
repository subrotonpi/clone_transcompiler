def import _sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a_arr = [ ]
        self.b_arr = [ ]
        self.c_arr = [ ]
    def main ( self ) :
        with open ( self.a_arr , 'r' ) as f :
            n = int ( f.read ( ) )
    def main ( self ) :
        d = [ [ ] for i in range ( 1 , n + 1 ) ]
        for i in range ( 1 , n + 1 ) :
            for j in range ( 1 , n + 1 ) :
                d [ i ] [ j ] = f.read ( )
    def main ( self ) :
        p = [ ]
        for i in range ( q ) :
            p.append ( i )
        cum_sum = [ ]
        for i in range ( 1 , n + 1 ) :
            for j in range ( 1 , n + 1 ) :
                cum_sum [ i ] [ j ] = cum_sum [ i - 1 ] [ j ] + cum_sum [ i ] [ j - 1 ] - cum_sum [ i - 1 ] [ j - 1 ] + d [ i ] [ j ]
        d = { }
        for i in range ( n ) :
            for i2 in range ( n ) :
                for j in range ( i + 1 , n + 1 ) :
                    for j2 in range ( i2 + 1 , n + 1 ) :
                        key = ( j2 - i2 ) * ( j - i )
                        d [ key ] = max ( d.get ( key , 0 ) , cum_sum [ j ] [ j2 ] - cum_sum [ i ] [ j2 ] - cum_sum [ j ] [ i2 ] + cum_sum [ i ] [ i2 ] )
        for i in range ( q ) :
            max = 0
            for k in d.keys ( ) :
                if k <= p [ i ] :
                    max = max ( d [ k ] , max )
            print ( max )
