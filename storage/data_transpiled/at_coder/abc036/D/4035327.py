def _import ( ) : return 33 <= c <= 126
class Main ( object ) :
    MOD = 1000000007
    def __init__ ( self , ptr ) :
        self.ptr = ptr
    def read ( self ) :
        if not self.ptr :
            raise StopIteration ( )
        s = [ ]
        while self.ptr :
            s.append ( self.ptr )
        return s
    def read ( self ) :
        if not self.ptr :
            raise StopIteration ( )
        n = False
        if self.ptr == '-' :
            minus = True
        if self.ptr < 0 or self.ptr <= '9' :
            n *= 10
            n += self.ptr - '0'
        elif self.ptr == - 1 or not self.ptr :
            return - n
        else :
            raise StopIteration ( )
    def read ( self ) :
        nl = self.ptr - 1
        if self.ptr < 0 or self.ptr > int ( nl ) :
            raise StopIteration ( )
        return next ( self )
    def write ( self , s ) :
        s.append ( s )
        return s
    def write ( self , s ) :
        s.append ( s )
        return s
    def read ( self ) :
        return self.ptr
    def write ( self , s ) :
        s.append ( s )
        return s
    def write ( self , s ) :
        s.append ( s )
        return s
    def write ( self , s ) :
        s.append ( s )
        return s
    def write ( self , s ) :
        s.append ( s )
        return s
