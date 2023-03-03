def main ( ) :
    import sys
    sys.stdout.write ( "\n" )
    T = sys.stdin.read ( )
    A = [ ]
    B = [ ]
    C = [ ]
    D = [ ]
    for i in range ( T ) :
        A.append ( i )
        B.append ( i )
        C.append ( i )
        D.append ( i )
    sys.stdout.write ( "\n" )
    s = [ ]
    for i in range ( T ) :
        if B [ i ] > A [ i ] or B [ i ] > D [ i ] :
            s.append ( "No" )
        elif C [ i ] >= B [ i ] - 1 :
            s.append ( "Yes" )
        else :
            g = gcd ( B [ i ] , D [ i ] )
            l = A [ i ] - B [ i ] + 1
            r = A [ i ] - C [ i ] - 1
            q = 0
            k = ( r - q + g ) / g - ( l - q + g - 1 ) / g
            if k > 0 :
                s.append ( "No" )
            else :
                s.append ( "Yes" )
        s.append ( "" )
    sys.stdout.write ( "\n".join ( s ) )
    def gcd ( m , n ) :
        if m < n :
            return gcd ( n , m )
        if n == 0 :
            return m
        return gcd ( n , m % n )
