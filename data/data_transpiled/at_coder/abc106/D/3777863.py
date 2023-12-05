def _import ( ) : return 33
class Main ( object ) :
    def __init__ ( self , ptr ) :
        super ( Main , self ).__init__ ( ptr )
    def skip_unprintable ( self ) :
        while self.has_next_byte ( ) and not self.is_printable_char ( self.ptr ) :
            self.ptr += 1
    def __iter__ ( self ) :
        return self.ptr
    def __next__ ( self ) :
        if not self.is_printable_char ( ) :
            raise StopIteration
        b = self.read_char ( )
        while self.is_printable_char ( b ) :
            self.ptr += 1
    def __next__ ( self ) :
        if self.ptr < 32 :
            raise StopIteration
        if self.ptr == 32 :
            return - n if self.ptr < 32 else n
        else :
            raise StopIteration
    def __next__ ( self ) :
        if self.ptr < 32 :
            raise StopIteration
        b = self.read_char ( )
        while self.ptr < 32 :
            b = self.read_char ( )
        return b
    def __next__ ( self ) :
        if self.ptr < 32 :
            return - n if self.ptr < 32 else n
        else :
            raise StopIteration
    def __next__ ( self ) :
        if self.ptr < 32 :
            return - n if self.ptr < 32 else n
        else :
            raise StopIteration
    def __next__ ( self ) :
        if self.ptr < 32 :
            return - n if self.ptr < 32 else n
        else :
            raise StopIteration
    def __next__ ( self ) :
        while self.ptr < 32 :
            b = self.read_char ( )
        return __next__
    def __next__ ( self ) :
        if self.ptr < 32 :
            return - n if self.ptr < 32 else n
        else :
            raise StopIteration
    def __next__ ( self ) :
        while self.ptr < 32 :
            b = self.read_char ( )
        return __next__
return Main
