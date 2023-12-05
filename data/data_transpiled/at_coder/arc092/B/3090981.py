def import _binary_search
class Main ( object ) :
    def __init__ ( self ) :
        self.n = len ( sys.stdin )
        self.a = [ ]
        self.b = [ ]
        for i in range ( n ) :
            self.a.append ( sys.stdin.read ( ) )
        for i in range ( n ) :
            self.b.append ( sys.stdin.read ( ) )
    def myBinarySearch ( la , key ) :
        self.n = len ( la )
        self.a = [ ]
        self.b = [ ]
        self.a.append ( a [ 0 ] )
        self.b.append ( b [ 0 ] )
        self.a.append ( a [ 1 ] )
        self.b.append ( b [ 1 ] )
        self.num = [ 0 ] * 29
        ans = 0
        for i in range ( 29 ) :
            ta = [ ]
            tb = [ ]
            for j in range ( n ) :
                ta.append ( a [ j ] % ( 2 << i ) )
                tb.append ( b [ j ] % ( 2 << i ) )
            tb.sort ( )
            pow1 = ( 2 << i ) // 2
            pow2 , pow3 , pow4 = 2 * pow1 , 3 * pow1 , 4 * pow1
            for j in range ( n ) :
                tmp1 = my_binary_search ( tb , pow1 - ta [ j ] )
                tmp2 = my_binary_search ( tb , pow2 - ta [ j ] )
                tmp3 = my_binary_search ( tb , pow3 - ta [ j ] )
                tmp4 = my_binary_search ( tb , pow4 - ta [ j ] )
                num.append ( tmp2 - tmp1 + tmp4 - tmp3 )
            if num [ i ] % 2 == 1 :
                ans += ( 2 << i ) // 2
        print ( ans )
    def myBinarySearch ( la , key ) :
        l = - 1
        r = len ( la )
        while r - l > 1 :
            m = ( l + r ) >> 1
            if la [ m ] >= key :
                r = m
            else :
                l = m
        return r
