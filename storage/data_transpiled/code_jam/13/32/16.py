def _ ( ) :
    import sys
    import random
    import string
    class ProblemB ( object ) :
        def run ( self ) :
            with open ( 'input.txt' , 'r' ) as f :
                self.num_cases = len ( f.readlines ( ) )
                for case_num in range ( 1 , num_cases + 1 ) :
                    X = f.readlines ( )
                    Y = f.readlines ( )
                    XX = abs ( X )
                    YY = abs ( Y )
                    a = min ( XX , YY )
                    b = max ( XX , YY )
                    x_toggle = X < 0
                    y_toggle = Y < 0
                    xy_toggle = ( a != XX )
                    p = get_path ( a , b )
                    N = len ( p )
                    if xy_toggle :
                        for i in range ( N ) :
                            p [ i ] = p [ i ] ^ 2
                    if x_toggle :
                        for i in range ( N ) :
                            if p [ i ] & 2 == 2 :
                                p [ i ] = p [ i ] ^ 1
                    if y_toggle :
                        for i in range ( N ) :
                            if p [ i ] & 2 == 0 :
                                p [ i ] = p [ i ] ^ 1
                    c = [ ]
                    for i in range ( N - 1 ) :
                        c.append ( get_char ( p [ i + 1 ] ) )
                    print ( "Case #%d: %s\n" % ( case_num , ''.join ( c ) ) )
        def get_char ( p ) :
            c = [ 'N' , 'S' , 'E' , 'W' ]
            return c [ p ]
        def triangle ( x ) :
            return ( x * ( x + 1 ) ) // 2
        def get_path ( X , Y ) :
            T = X + Y
            n = ( int ( sqrt ( 2 * T ) ) - 5 )
            while n < 0 or triangle ( n ) < T or ( triangle ( n ) - T ) % 2 == 1 :
                n += 1
            gap = triangle ( n ) - T
            return ( x * ( x + 1 ) ) // 2
    return ProblemB
