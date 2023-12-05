def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            c = [ [ sc.randint ( 0 , 3 ) for i in range ( 3 ) ] for j in range ( 3 ) ]
            a = [ min ( c [ i ] [ 0 ] , min ( c [ i ] [ 1 ] , c [ i ] [ 2 ] ) ) for i in range ( 3 ) ]
            b = [ min ( c [ 0 ] [ i ] , min ( c [ 1 ] [ i ] , c [ 2 ] [ i ] ) ) for i in range ( 3 ) ]
            flag = False
            for i in range ( a [ 0 ] , - 1 , - 1 ) :
                for j in range ( a [ 1 ] , - 1 , - 1 ) :
                    for k in range ( a [ 2 ] , - 1 , - 1 ) :
                        l = c [ 0 ] [ 0 ] - i
                        m = c [ 1 ] [ 1 ] - j
                        n = c [ 2 ] [ 2 ] - k
                        if i + l == c [ 0 ] [ 0 ] and i + m == c [ 0 ] [ 1 ] and i + n == c [ 0 ] [ 2 ] and j + l == c [ 1 ] [ 0 ] and j + m == c [ 1 ] [ 1 ] and j + n == c [ 1 ] [ 2 ] and k + l == c [ 2 ] [ 0 ] and k + m == c [ 2 ] [ 1 ] and k + n == c [ 2 ] [ 2 ] :
                            flag = True
                            break
        if flag :
            sys.stdout.write ( "Yes\n" )
        else :
            sys.stdout.write ( "No\n" )
