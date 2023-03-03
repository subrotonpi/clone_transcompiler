def _import ( ) :
    import sys
    import os
    import getopt
    import getopt
    class Main ( object ) :
        def __init__ ( self , * args ) :
            super ( Main , self ).__init__ ( * args )
        def __call__ ( self , * args ) :
            sc = getopt.Getgetopt ( args )
            N = sc.size
            M = sc.size
            a = [ [ ] for _ in range ( N + 1 ) ]
            ans = [ [ ] for _ in range ( M + 1 ) ]
            lis = [ [ ] for _ in range ( M + 1 ) ]
            for i in range ( N ) :
                a [ i ].append ( sc.randint ( 0 , M // i + 1 ) )
                lis [ i ].append ( a [ i ] [ 1 ] )
            ft = FenwickTree ( M + 1 )
            div = [ [ ] for _ in range ( M + 1 ) ]
            for i in range ( 1 , M ) :
                for j in range ( i , M + 1 , i ) :
                    div [ j ].append ( i )
            for i in range ( 1 , M ) :
                for v in lis [ i ] :
                    ft.add ( v , 1 )
                for v in div [ i ] :
                    k = v
                    m = i // k
                    ans [ m ] [ k ] += ft.sum ( min ( M , ( k + 1 ) * m - 1 ) ) - ft.sum ( k * m - 1 )
    f = open ( "/dev/tty" , "w" )
    for m in range ( 1 , M + 1 ) :
        s = 0
        for v in ans [ m ] :
            s += v
        f.write ( s )
    f.close ( )
    return Main
