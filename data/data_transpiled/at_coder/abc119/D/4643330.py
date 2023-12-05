def import _solve
class Main ( object ) :
    INF = 1000000000000L
    def __init__ ( self ) :
        sc = _raw_input
        a = sc.__next__ ( )
        b = sc.__next__ ( )
        q = sc.__next__ ( )
        s = [ ]
        t = [ ]
        x = [ ]
        s.append ( - INF )
        for i in range ( 1 , a + 1 ) :
            s.append ( sc.__next__ ( ) )
        s.append ( INF )
        t.append ( - INF )
        for i in range ( 1 , b + 1 ) :
            t.append ( sc.__next__ ( ) )
        t.append ( INF )
        for i in range ( q ) :
            x.append ( sc.__next__ ( ) )
        s.sort ( )
        t.sort ( )
        for i in range ( q ) :
            ok = a + 1
            ng = - 1
            while abs ( ok - ng ) > 1 :
                mid = ( ok + ng ) // 2
                if solve ( s [ int ( mid ) ] , x [ i ] ) :
                    ok = mid
                else :
                    ng = mid
            sb = s [ int ( ok ) ]
            sa = s [ int ( ok - 1 ) ]
            ok = b + 1
            ng = - 1
            while abs ( ok - ng ) > 1 :
                mid = ( ok + ng ) // 2
                if solve ( t [ int ( mid ) ] , x [ i ] ) :
                    ok = mid
                else :
                    ng = mid
            tb = t [ int ( ok ) ]
            ta = t [ int ( ok - 1 ) ]
            res1 = abs ( tb - x [ i ] ) * 2 + abs ( sa - x [ i ] )
            res2 = abs ( sa - x [ i ] ) * 2 + abs ( tb - x [ i ] )
            res3 = abs ( ta - x [ i ] ) * 2 + abs ( tb - x [ i ] )
            res8 = abs ( tb - x [ i ] ) * 2 + abs ( tb - x [ i ] )
            ans.append ( res1 )
return Main
