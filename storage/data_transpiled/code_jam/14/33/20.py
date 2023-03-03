def import _enclose
class C ( object ) :
    def __init__ ( self , arg ) :
        sc = _enclose
        for tc , tcc in enumerate ( sc ) :
            n , m , k = sc.regs [ tc ]
            grid = [ [ 0 , 0 ] ] * m
            best = m * n
            for bm in range ( ( 1 << ( m * n ) ) ) :
                cur = 0
                for i in range ( m ) :
                    for j in range ( n ) :
                        grid [ i ] [ j ] = 0 != ( bm & ( 1 << ( n * i + j ) ) )
                        if grid [ i ] [ j ] :
                            cur += 1
                if cur < best and _enclose ( grid ) >= k :
                    best = cur
            print ( "Case #%d: %d" % ( tc , best ) )
    di = [ - 1 , 1 , 0 , 0 ]
    dj = [ 0 , 0 , - 1 , 1 ]
    def enclose ( grid ) :
        ret = 0
        for row in grid :
            for val in row :
                if val :
                    ret += 1
            m , n = len ( grid ) , len ( grid [ 0 ] )
            for i in range ( m ) :
                for j in range ( n ) :
                    if i != 0 and j != 0 and i != m - 1 and j != n - 1 :
                        continue
                    if grid [ i ] [ j ] :
                        continue
                    q = [ [ i , j ] ]
                    grid [ i ] [ j ] = True
                    while True :
                        cur = q.pop ( )
                        for d in range ( len ( di ) ) :
                            ni = cur [ 0 ] + di [ d ]
                            nj = cur [ 1 ] + dj [ d ]
                            if ni < 0 or nj < 0 or ni >= m or nj >= n :
                                continue
                            if grid [ ni ] [ nj ] :
                                continue
                        grid [ ni ] [ nj ] = True
        return ret
return C
