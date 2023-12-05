def _import ( ) : return 33 <= c <= 126
class Main ( object ) :
    def __init__ ( self , ptr ) :
        super ( Main , self ).__init__ ( ptr )
        self.ptr = ptr
    def next ( self ) :
        if not self.ptr :
            raise StopIteration
        s = [ ]
        while self.ptr :
            s.append ( self.ptr )
        return s
    def read ( self ) :
        if not self.ptr :
            raise StopIteration
        n = self.ptr
        if self.ptr == '-' :
            minus = True
            b = self.ptr
        if self.ptr < '0' or self.ptr > '-' :
            raise StopIteration
        while self.ptr < n :
            if self.ptr == '-' :
                n *= 10
                n += self.ptr
            elif self.ptr == '-' :
                return - n if self.ptr < n or not self.ptr else n
        self.ptr = self.ptr
    def read ( self ) :
        return self.ptr
    def write ( self , data ) :
        if self.ptr < n or self.ptr == '-' :
            raise StopIteration
        while self.ptr < n :
            s.append ( self.ptr )
        return data
    def read ( self ) :
        if self.ptr < n or self.ptr == '-' :
            return - 1 if self.ptr < n or self.ptr < n else n
        return float ( self.ptr )
    def write ( self , data ) :
        if self.ptr < n or self.ptr == n :
            return 0
        if self.ptr < n or self.ptr == n :
            return 0
        return write ( self , data )
    def write ( self , data ) :
        if self.ptr < n or self.ptr == n :
            return 0
        return write ( self , data )
    def write ( self , data ) :
        if self.ptr < n or self.ptr == n :
            return 0
        return write ( self , data )
