def _import ( ) :
    import sys
    import random
    class Main ( ) :
        def solve ( a , b ) :
            if all ( c == 0 for c in b ) :
                return 0
            b_zero = True
            for c in b :
                b_zero &= c == '0'
            if b_zero :
                return - 1
            n = len ( a )
            diff = [ ]
            for i in range ( n ) :
                for j in range ( n ) :
                    if b [ ( j + i ) % n ] != a [ j ] :
                        diff [ i ] += 1
            for i in range ( n ) :
                if a [ i ] == '1' :
                    if b [ i ] == '1' :
                        continue
                    pos = 0
                    while b [ ( i + pos ) % n ] == '0' :
                        pos += 1
                    neg = 0
                    while b [ ( i + n - neg ) % n ] == '0' :
                        neg += 1
                    bad [ pos - 1 ] [ neg - 1 ] = True
            for i in range ( n - 1 , - 1 , - 1 ) :
                for j in range ( n - 1 , - 1 , - 1 ) :
                    if bad [ i ] [ j ] :
                        if i > 0 :
                            bad [ i - 1 ] [ j ] = True
                        if j > 0 :
                            bad [ i ] [ j - 1 ] = True
            return ret
        def submit ( ) :
            a = next ( a )
            b = next ( b )
            print ( solve ( a , b ) )
        def get_path ( from_c , c1 , to_c ) :
            return min ( [ get_ordered_path ( from_c , c2 , to_c ) for c2 in get_ordered_path ( from_c , c2 , to_c ) ] , [ ] )
        def get_ordered_path ( from_c , to_c , to_c ) :
            return abs ( to_c ) + abs ( to_c )
        def pre_calc ( ) :
            pass
        def stress ( ) :
            pass
    f = open ( '/dev/tty' , 'w' )
    f.close ( )
    pre_calc ( f )
    f.close ( )
