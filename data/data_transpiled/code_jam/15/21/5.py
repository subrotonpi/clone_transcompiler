def import _solve
class A ( object ) :
    def __init__ ( self , v ) :
        self.T = int ( v )
        for i in range ( 1 , T + 1 ) :
            N = _solve ( self.T )
            print ( "Case #%d: %d\n" % ( i , solve ( N ) ) )
    def solve ( v ) :
        if v <= 10 : return v
        v = ( "%d" % v ).ljust ( 10 )
        mod = 1
        for i in range ( v // 2 ) :
            mod *= 10
        if v % mod == 0 : return solve ( v - 1 ) + 1
        add = v % mod - 1
        v -= add
        rev = 0
        tmp = v
        while tmp > 0 :
            rev *= 10
            rev += tmp % 10
            tmp /= 10
        if rev != v : return solve ( rev ) + add + 1
        return solve ( v - 1 ) + add + 1
