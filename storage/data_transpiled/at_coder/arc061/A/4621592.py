def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            S = sc.read ( )
            length = len ( S ) - 1
            tmp = 0
            answer = 0
            for i in range ( ( 1 << length ) ) :
                tmp = 0
                for j in range ( length ) :
                    if ( i >> j ) % 2 == 1 :
                        answer += int ( S [ tmp : j + 1 ] )
                        tmp = j + 1
                answer += int ( S [ tmp : ] )
            print ( answer )
            sc.close ( )
    return Main
