def import import _sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = _sys._getframe ( 1 )
        INF = 1_000_000_000
        n = sc.f_number
        c = sc.f_number
        x = [ ]
        v = [ ]
        for i in range ( n ) :
            x.append ( sc.f_number )
            v.append ( sc.f_number )
        sum1 = sum2 = 0
        dp1 = [ ]
        dp2 = [ ]
        for i in range ( n ) :
            sum1 += v [ i ]
            dp1.append ( sum1 - x [ i ] )
            dp1.append ( max ( dp1 [ i ] , dp1 [ i + 1 ] ) )
            sum2 += v [ n - i - 1 ]
            dp2.append ( sum2 - ( c - x [ n - i - 1 ] ) )
            dp2.append ( max ( dp2 [ i ] , dp2 [ i + 1 ] ) )
        ans = 0
        for i in range ( n ) :
            a1 = max ( dp1 [ i + 1 ] , dp1 [ i + 1 ] - x [ i ] + dp2 [ n - i - 1 ] )
            a2 = max ( dp2 [ i + 1 ] , dp2 [ i + 1 ] - ( c - x [ n - i - 1 ] ) + dp1 [ n - i - 1 ] )
            aa = max ( a1 , a2 )
            ans = max ( ans , aa )
        print ( ans )
