def _import ( ) :
    import sys
    import os
    import sys
    import os
    class A ( ) :
        def __init__ ( self , arg ) :
            self.arg = arg
    def solve ( ) :
        test_no = sys.maxint
        for test in range ( 1 , test_no + 1 ) :
            r , c = next ( self ) , next ( self )
            d = [ [ - 1 ] for x in range ( r + 2 , c + 2 ) ]
            for i in range ( r ) :
                s = next ( self )
                for j in range ( c ) :
                    d [ i + 1 ] [ j + 1 ] = '^>v<'.index ( s [ j ] )
        dx = [ - 1 , 0 , 1 , 0 ]
        dy = [ 0 , 1 , 0 , - 1 ]
        r += 2
        c += 2
        ans = 0
        can = True
        for i in range ( r ) :
            for j in range ( c ) :
                if d [ i ] [ j ] != - 1 :
                    min = 2
                    for q in range ( 4 ) :
                        x = i + dx [ q ]
                        y = j + dy [ q ]
                        while 0 <= x < r and 0 <= y < c and d [ x ] [ y ] == - 1 :
                            x += dx [ q ]
                            y += dy [ q ]
                        if 0 <= x < r and 0 <= y < c :
                            min = min ( min , q == d [ i ] [ j ] )
                    if min == 2 :
                        can = False
                    ans += min
        if can :
            self.out.write ( "Case #%d: %d\n" % ( test , ans ) )
        else :
            self.out.write ( "Case #%d: IMPOSSIBLE\n" % test )
    def out ( self , format , * s ) :
        sys.stdout.write ( format % s )
        sys.stdout.flush ( )
