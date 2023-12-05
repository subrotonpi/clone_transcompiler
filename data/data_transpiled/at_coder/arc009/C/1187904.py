def _import ( ) : return _import ( )
class Main ( object ) :
    def __init__ ( self ) :
        self.mod = 1777777777
    def skip_unprintable ( self ) :
        while self._hasNextByte ( ) and not self._hasNextByte ( ) :
            self.ptr += 1
    def __next__ ( self ) :
        return ( )
    def next_longlist ( self , n ) :
        return [ ]
    def next_intlist ( self , n ) :
        ret = [ ]
        for i in range ( n ) :
            ret.append ( next_longlist ( self , n ) )
        return ret
    def __next__ ( self , n ) :
        if not self._hasNextByte ( ) :
            raise StopIteration
        yield ( )
        for i in range ( n ) :
            ret.append ( next_intlist ( self , n ) )
        return ret
    def __next__ ( self , n ) :
        if not self._hasNextByte ( ) :
            raise StopIteration
        else :
            n *= ( n - 1 )
        return n
    def __next__ ( self , n ) :
        ret = [ ]
        for i in range ( n ) :
            ret.append ( next_intlist ( self , n ) )
        return ret
    def __next__ ( self , n ) :
        if not self._hasNextByte ( ) :
            raise StopIteration
        else :
            n += 1
        return n
    def extgcd ( self , a ) :
        u = 1
        v = 0
        x = 1
        y = 1
        while a > 0 :
            q = b // a
            x -= q * u
            y -= q * v
            b -= q * a
            tmp = x
            x = u
            u = tmp
            y = v
            v = tmp
            tmp = b
            b = a
            a = tmp
        return b , x , y
    def inverse ( self , n ) :
        gcd = extgcd ( n , mod )
        if gcd [ 0 ] == 1 :
            return ( gcd [ 1 ] + mod ) % mod
        else :
            return 0
class FastScanner ( object ) :
    def __init__ ( self ) :
    