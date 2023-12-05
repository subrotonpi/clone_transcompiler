def _ ( ) : return sum ( [ int ( x ) for x in c ] )
MOD = 1000000007
class Main ( object ) :
    def __init__ ( self , mod ) :
        self.mod = mod
        self.N = len ( mod )
        self.num = { }
        self.c = [ ]
        for i in range ( 4 ) :
            for j in range ( 4 ) :
                self.c [ i ] << 10 | self.c [ ( i + j ) % 4 ]
        self.code = self.code
    def bit ( self , s , t ) :
        self.v >>= s
        return self.v & ( ( 1 << ( t - s ) ) - 1 )
    ans = 0
    side = [ ]
    side_code = [ ]
    for i in range ( N ) :
        bottom_code = self.code
        self.num [ bottom_code ] = self.num [ bottom_code ] - 1
        for j in range ( 4 ) :
            side [ j ] [ 0 ] = self.c [ i ] [ j ]
            side [ j ] [ 3 ] = self.c [ i ] [ ( j + 1 ) % 4 ]
        for j in range ( i + 1 ) :
            top_code = self.code [ j ]
            for d in range ( 4 ) :
                temp = 1
                for k in range ( 4 ) :
                    side [ k ] [ 2 ] = self.c [ j ] [ ( d - k + 4 ) % 4 ]
                    side [ k ] [ 1 ] = self.c [ j ] [ ( d - k + 5 ) % 4 ]
                    side_code [ k ] = self.code [ k ]
                    cnt = self.num.get ( side [ k ] )
                    if cnt and cnt > 0 :
                        if self.side_code [ k ] == top_code and cnt > 0 :
                            cnt -= 1
                        for l in range ( k ) :
                            if self.side_code [ l ] == side_code [ l ] and cnt > 0 :
                                cnt -= 1
                            if self.bit ( side [ k ] , 0 , 10 ) == bit ( side [ k ] , 10 , 20 ) :
                                cnt <<= 1
                    else :
                        temp = 0
                        break
    