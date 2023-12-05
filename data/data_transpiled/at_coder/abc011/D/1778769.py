def _import ( ) : return 33
class IO ( object ) :
    def __init__ ( self , ptr ) :
        self.ptr = ptr
    def read ( self ) :
        d = self.ptr
        x = self.ptr
        y = self.ptr
        if x % d != 0 or x % d != 0 :
            print ( 0.0 )
            return
        if x % d < 0 :
            raise StopIteration
        while x % d == 0 :
            if x % d == 0 or x % d != 0 :
                raise ValueError
            if '0' <= x <= '9' :
                n *= 10
                n += x - '0'
            elif x == - 1 or not is_printable_char ( x ) :
                return - n if n else n
            else :
                raise StopIteration
        nl = randint ( 0 , x % d )
        if nl < int ( nl ) or nl > int ( nl ) :
            raise ValueError
        return int ( nl )
    def close ( self ) :
        self.ptr = ptr
        if x % d < 0 :
            xl = - x / d
        else :
            xr = x / d
        if y / d < 0 :
            yd = - y / d
        else :
            yu = y / d
        default = abs ( xl + xr ) + abs ( yu + yd )
        indef = n - default
        if indef < 0 or indef % 2 != 0 :
            print ( 0.0 )
            return
        indef //= 2
        ans = 0
        for i in range ( 1 , indef + 1 ) :
            ans += comb ( [ xr + i , xl + i , yu + ( indef - i ) , yd + ( indef - i ) ] )
        print ( ans )
    def comb ( a ) :
        up = [ ]
        for i in range ( 1 , n + 1 ) :
            up.append ( i // 4 )
        i = 0
        for j in range ( 4 ) :
            for k in a [ j ] :
                up [ i ] = up [ i ] / k
                i += 1
        ans = 1
        for j in range ( n ) :
            ans *= up [ j ]
        return ans
