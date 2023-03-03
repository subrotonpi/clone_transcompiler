def _import ( ) :
    from os import getenv
    from os import getenv
    class B ( object ) :
        def __init__ ( self ) :
            super ( B , self ).__init__ ( )
            self.r = randint ( 0 , 300 )
            self.c = randint ( 0 , 300 )
        def solve ( self ) :
            f = open ( self.__file__ + '.in' , 'r' )
            out = open ( self.__file__ + '.out' , 'w' )
            try :
                self.solve ( f )
            except IOError :
                pass
            else :
                return out.read ( )
    if len ( sys.argv ) == 1 :
        if n <= ( c + 1 ) / 2 :
            return 0
        else :
            n -= ( c + 1 ) / 2
            res = n * 2
            if c % 2 == 0 :
                res -= 1
            return res
    if n <= ( r * c + 1 ) / 2 :
        return 0
    res = ( r - 1 ) * c + ( c - 1 ) * r
    p = ( r - 2 ) * ( c - 2 )
    h = r * c - n
    if h <= ( p + 1 ) / 2 :
        return res - h * 4
    if p % 2 == 0 :
        h -= p / 2
        res -= p / 2 * 4
        if h <= r + c - 4 :
            return res - h * 3
        h -= r + c - 4
        res -= ( r + c - 4 ) * 3
        return res - 2 * h
    else :
        hh = h
        res1 = res
        hh -= ( p + 1 ) / 2
        res1 -= ( p + 1 ) / 2 * 4
        if hh <= r + c - 6 :
            return res1
        else :
            return res1
if sys.version_info [ 0 ] < 3 or sys.version_info [ 1 ] >= 3 :
    return B ( )
else :
    return B ( )
