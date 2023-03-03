def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        A = sc.randint ( 0 , A )
        B = sc.randint ( 0 , B )
        Q = sc.randint ( 0 , Q )
        s = [ sc.randint ( 0 , A ) for i in range ( A ) ]
        t = [ sc.randint ( 0 , B ) for i in range ( B ) ]
        for i in range ( Q ) :
            x = sc.randint ( 0 , Q )
            s_posi = ~ np.where ( s == x )
            t_posi = ~ np.where ( t == x )
            s1 = - 1
            t1 = - 1
            s2 = - 1
            t2 = - 1
            if 0 < s_posi :
                s1 = s [ s_posi - 1 ]
            if s_posi < A :
                s2 = s [ s_posi ]
            if 0 < t_posi :
                t1 = t [ t_posi - 1 ]
            if t_posi < B :
                t2 = t [ t_posi ]
            ans = sum ( [ x ] * x )
            d = 0
            if s1 and t1 :
                d = max ( abs ( x - s1 ) , abs ( x - t1 ) )
                ans = min ( ans , d )
            if s2 and t2 :
                d = max ( abs ( x - s2 ) , abs ( x - t2 ) )
                ans = min ( ans , d )
            if t1 and s2 :
                d = min ( abs ( x - t1 ) , abs ( x - s2 ) ) + abs ( t1 - s2 )
                ans = min ( ans , d )
            if t2 and s1 :
                d = min ( abs ( x - t2 ) , abs ( x - s1 ) ) + abs ( t2 - s1 )
                ans = min ( ans , d )
            print ( ans )
return Main
