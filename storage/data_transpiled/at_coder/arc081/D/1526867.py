def _solve ( ) : return _solve ( )
def main ( ) :
    input_file = sys.stdin
    output_file = sys.stdout
    with input_file :
        for i in range ( h + 1 ) :
            for j in range ( w + 1 ) :
                y [ i ] = z [ i ] [ j ]
    ans = max ( ans , w )
    class F ( object ) :
        def __init__ ( self , x , y ) :
            self.x = x
            self.y = y
    def solve ( self , h , w , z ) :
        up = [ ]
        for i in range ( 1 , h ) :
            for j in range ( 1 , w ) :
                if not z [ i ] [ j ] :
                    up.append ( [ i , j ] )
        ans = 1
        for i in range ( 1 , h + 1 ) :
            s = [ ( 0 , - 1 ) ]
            for j in range ( 1 , w + 1 ) :
                while s [ - 1 ] [ 1 ] >= up [ i ] [ j ] :
                    v = ( j - s [ - 2 ] [ 0 ] ) * ( s [ - 1 ] [ 1 ] + 1 )
                    if v > ans :
                        ans = v
                    s.pop ( )
                s.append ( ( j , up [ i ] [ j ] ) )
        return ans
    def solve ( self , test_number , input_file , output_file ) :
        h , w = self.x , self.y
        b = [ ]
        for s in test_number.split ( ) :
            for j in range ( w - 1 ) :
                b [ i ] [ j ] = s [ j ] == '#'
        return b
    return solve ( 1 , h , w , f )
return main
