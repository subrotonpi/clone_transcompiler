def import _solve
class B ( object ) :
    def __init__ ( self , sc ) :
        self.sc = sc
        self.N , self.K = self.sc
        self.S = [ ]
        for i in range ( 1 , T + 1 ) :
            ans = self.solve ( )
            self.print ( "Case #%d: %s\n" % ( i , ans ) )
    def solve ( self ) :
        self.N , self.K = self.sc.split ( )
        self.S = [ ]
        for i in range ( 0 , N - K + 1 ) :
            self.S.append ( self.sc.split ( ) [ i ] )
    min = [ ]
    max = [ ]
    for i in range ( K ) :
        cur = i
        v = 0
        while cur < N - K :
            v = v + S [ cur + 1 ] - S [ cur ]
            min.append ( min [ i ] )
            max.append ( max [ i ] )
            cur += K
    rest = S [ 0 ]
    mi = sum ( min [ i ] for i in range ( K ) )
    for i in range ( K ) :
        diff = min [ i ] - mi
        min [ i ] -= diff
        max [ i ] -= diff
        rest += diff
    while rest < 0 :
        rest += K
    rest %= K
    while rest > 0 :
        mav = sum ( min [ i ] for i in range ( K ) )
        miv = sum ( max [ i ] for i in range ( K ) )
        mai = 0
        for i in range ( K ) :
            if max [ i ] > mav or ( max [ i ] == mav and min [ i ] < miv ) :
                mai = i
                mav = max [ i ]
                miv = min [ i ]
        id = - 1
        mimin = sum ( min [ i ] for i in range ( K ) )
        for i in range ( K ) :
            if max [ i ] == mav :
                continue
            if min [ i ] < mimin :
                mimin = min [ i ]
                id = i
    return B
