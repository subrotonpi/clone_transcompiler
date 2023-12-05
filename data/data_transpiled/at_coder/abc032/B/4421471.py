def _import ( ) : return 33 <= n <= 126
def _import ( ) :
    from sys import stdin
    from io import BytesIO
    def solve ( ) :
        s = next ( )
        n = randint ( 0 , len ( s ) )
        if n > len ( s ) :
            out.write ( 0 )
            return
        s = set ( )
        for i in range ( len ( s ) - n + 1 ) :
            s.add ( s [ i : i + n ] )
        out.write ( len ( s ) )
    def next_charss ( h , w , b ) :
        ar = [ h + 2 if b else h ] + [ w if b else h ] + [ i + 1 if b else 0 ]
        for i in range ( n ) :
            ar.append ( s [ i : i + n ] )
        out.write ( ''.join ( s ) )
    def next_ints ( n ) :
        ar = [ ]
        for i in range ( n ) :
            ar.append ( s [ i : i + n ] )
        out.write ( ''.join ( ar ) )
    def max_int ( * ar ) :
        ar = [ ]
        for i in range ( n ) :
            ar.append ( s [ i : i + n ] )
        return ar
    def min_int ( * ar ) :
        ar = [ ]
        for i in range ( n ) :
            ar.append ( s [ i : i + n ] )
        return ar
    def calc_manhat_distance ( x1 , y1 , x2 , y2 ) :
        d = abs ( x1 - x2 ) + abs ( y1 - y2 )
        return d
    def calc_euclid_distance ( x1 , y1 , x2 , y2 ) :
        d = math.sqrt ( ( x2 - x1 ) ** 2 + ( y2 - y1 ) ** 2 )
        return d
    def print_charss ( ar ) :
        for i in range ( len ( ar ) ) :
            for j in range ( len ( ar [ 0 ] ) ) :
                out.write ( ar [ i ] [ j ] )
            out.write ( '' )
    return
