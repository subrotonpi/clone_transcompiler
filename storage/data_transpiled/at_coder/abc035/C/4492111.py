def _import ( ) : return _fasta_read ( )
class Main ( object ) :
    def __init__ ( self ) :
        self.N = int ( )
        self.Q = int ( )
        self.change_point = [ ]
        for t in range ( self.Q ) :
            start = self.N - 1
            end = self.Q - 1
            self.change_point.append ( not self.change_point [ start ] )
            if end < N :
                self.change_point.append ( not self.change_point [ end ] )
        s = [ ]
        c = 0
        for i in range ( self.N ) :
            if self.change_point [ i ] :
                c = 1 - c
            s.append ( c )
        print ( s )
    class FastScanner ( object ) :
        def __init__ ( self , buffer ) :
            self.buffer = buffer
            self.ptr = 0
            self.buflen = 0
            def has_next_byte ( ) :
                if self.ptr < self.buflen :
                    return True
                else :
                    self.ptr = 0
                    try :
                        buflen = self.buffer.get ( self.ptr )
                    except AttributeError :
                        pass
                    if buflen <= 0 :
                        return False
                return True
            def read_byte ( self ) :
                if self.ptr < self.buflen :
                    return self.ptr
                else :
                    return - 1
            def is_printable_char ( c ) :
                return 33 <= c <= 126
            def skip_unprintable ( self ) :
                while self.ptr < self.buflen and not is_printable_char ( self.buffer [ self.ptr ] ) :
                    self.ptr += 1
            def __iter__ ( self ) :
                return self.ptr
        def __next__ ( self ) :
            if not self.prev :
                self.prev = self.prev
            else :
                self.prev = self.prev
    return Main ( )
