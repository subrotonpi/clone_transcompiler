def _import ( ) :
    from scipy.optimize import solve
    EPS = 1e-9
    INF = 1e8
    def sol ( j , x , p , u , v ) :
        xx = 0
        if j == 0 : xx = x [ 0 ] + x [ 1 ] + x [ 2 ]
        if j == 1 : xx = - x [ 0 ] + x [ 1 ] + x [ 2 ]
        if j == 2 : xx = x [ 0 ] - x [ 1 ] + x [ 2 ]
        if j == 3 : xx = x [ 0 ] + x [ 1 ] - x [ 2 ]
        dx = u * p
        if v == 0 : return xx - dx
        else : return xx + dx
    def cou ( x , p , n ) :
        l = 0
        r = INF
        while r - l > EPS :
            u = ( l + r ) / 2
            ll = [ - INF ] * 4
            rr = [ INF ] * 4
            for i in range ( n ) :
                for j in range ( 4 ) :
                    t = sol ( j , x [ i ] , p [ i ] , u , 0 )
                    if ll [ j ] < t : ll [ j ] = t
                    t = sol ( j , x [ i ] , p [ i ] , u , 1 )
                    if rr [ j ] > t : rr [ j ] = t
            e = 1
            for j in range ( 4 ) :
                if ll [ j ] - EPS > rr [ j ] : e = - 1
            if e == 1 : r = u
            else : l = u
        return l
    with open ( 'input.txt' , 'w' ) as f :
        _ = solve ( cou , x , p , n )
    with open ( 'output.txt' , 'w' ) as f :
        _ = solve ( cou , x , p , n )
