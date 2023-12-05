def _import ( ) :
    from sys import stdin
    from struct import Struct
    from struct import Struct
    class Main ( object ) :
        def __init__ ( self , ** kwargs ) :
            super ( Main , self ).__init__ ( ** kwargs )
            self.K = Struct ( 'K' )
        def read ( self ) :
            sc = self.K.read ( )
            x = sc.unpack ( '<' + self.K [ 0 ] ) [ 0 ]
            y = sc.unpack ( '<' + self.K [ 1 ] ) [ 0 ]
            if x < y :
                print ( 'Better' )
            else :
                print ( 'Worse' )
    class FastScanner ( object ) :
        def __init__ ( self , buffer ) :
            self.buffer = buffer
            self.ptr = 0
            self.buflen = 0
            def has_next_byte ( self ) :
                if self.ptr < self.buflen :
                    return True
                else :
                    self.ptr = 0
                    try :
                        buflen = self.buffer.read ( self.buflen )
                    except AttributeError :
                        pass
                    if self.buflen <= 0 :
                        return False
                return True
            def read_byte ( self ) :
                if self.ptr < self.buflen :
                    return self.buffer [ self.ptr ]
                else :
                    return - 1
            def is_printable_char ( c ) :
                return 33 <= c <= 126
            def skip_unprintable ( self ) :
                while self.ptr < self.buflen and not is_printable_char ( self.buffer [ self.ptr ] ) :
                    self.ptr += 1
            def __next__ ( self ) :
                return self.ptr
            def __next__ ( self ) :
                if not self.ptr :
                    raise StopIteration
                s = [ ]
                b = self.read_byte ( )
                while self.is_printable_char ( b ) :
                    s.append ( b )
                    b = self.read_byte ( )
                return s
        def __next__ ( self ) :
            if self.ptr < self.buflen :
                return - 1
            else :
                raise StopIteration
    return Main ( )
