def _import ( ) :
    from sys import stdin as stream
    from struct import Struct
    class Main ( object ) :
        def __init__ ( self , stream ) :
            sc = stream.read ( 1 )
            h = sc.unpack ( '>H' ) [ 0 ]
            m = sc.unpack ( '>H' ) [ 0 ]
            now = h * 60 + m
            print ( 18 * 60 - now )
    class FastScanner ( object ) :
        def __init__ ( self , stream ) :
            stream.read ( 1 )
        def read ( self , ptr = 0 ) :
            if self.ptr < self.buflen :
                return True
            else :
                self.ptr = 0
                try :
                    buflen = stream.read ( self.ptr )
                except AttributeError :
                    pass
                if self.buflen <= 0 :
                    return False
            return True
        def read ( self , ptr = ptr ) :
            if self.ptr < self.buflen :
                return self.ptr
            else :
                return - 1
        def is_printable_char ( c ) :
            return 33 <= c <= 126
        def skip_unprintable ( self ) :
            while self.ptr < self.ptr and not is_printable_char ( self.ptr ) :
                self.ptr += 1
        def __iter__ ( self ) :
            return self.ptr
        def next ( self ) :
            if not self.ptr :
                raise StopIteration
            s = [ ]
            b = self.read ( 1 )
            while self.ptr == self.ptr :
                s.append ( b )
                b = self.read ( 1 )
            return s
        def decode ( self ) :
            if not self.ptr :
                raise StopIteration
            s.reverse ( )
            return s
    return Main ( )
