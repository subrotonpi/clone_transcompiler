def import _PermRLE
class PermRLE ( object ) :
    def __init__ ( self ) :
        sc = _PermRLE.raw_input ( )
        for i in range ( 1 , N + 1 ) :
            K = int ( sc.next ( ) )
            self.str = sc.next ( )
            self.compute_costs ( )
            res = INF
            for j in range ( K ) :
                self.first = j
                res = min ( res , solve ( ) )
            print ( "Case #{}: {}".format ( i , res ) )
    def solve ( self ) :
        self.memo = [ [ ] for _ in range ( 1 << K ) ]
        for arr in self.memo :
            arr.insert ( 0 , - 1 )
        return solve ( self.first , 1 << self.first ) + 1
    def solve ( self , prev , mask ) :
        if self.memo [ prev ] [ mask ] == - 1 :
            count , res = sum ( [ i for i in self.memo if mask & 1 << i ] ) , INF
            if count == K :
                res = self.join_cost [ prev ] [ first ]
            else :
                for i in range ( K ) :
                    if mask & 1 << i == 0 :
                        res = min ( res , self.cost [ prev ] [ i ] + solve ( i , mask | 1 << i ) )
            self.memo [ prev ] [ mask ] = res
        return self.memo [ prev ] [ mask ]
K , M , first , INF = 10000000 , 10000000 , 10000000
def compute_costs ( self ) :
    M = len ( self.str ) // K
    self.cost = [ 0 ] * K
    self.join_cost = [ 0 ] * K
    for i in range ( K ) :
        for j in range ( K ) :
            if i == j :
                continue
            for k in range ( M ) :
                if self.str [ k * K + i ] != self.str [ k * K + j ] :
                    self.cost [ i ] [ j ] += 1
                if k + 1 < M and self.str [ k ] != self.str [ k ] :
                    self