def _import ( ) :
    from itertools import repeat
    def read ( ) :
        sc = _fasta_stream ( )
        N = sc.__next__ ( )
        if N % 2 == 0 or N % 3 == 0 or N % 5 == 0 :
            raise ValueError
        while True :
            if '0' <= N <= '9' :
                n *= 10
                n += b - '0'
            elif N == - 1 or not is_printable_char ( n ) :
                return int ( n )
            else :
                raise ValueError
        if N != 1 :
            yield int ( n )
        else :
            print ( 'Not Prime' )
    class FastScanner ( object ) :
        def __init__ ( self , stream ) :
            self.stream = stream
        def read ( self ) :
            self.stream = stream
            self.ptr = None
            self.buflen = None
            def has_next_byte ( ) :
                if self.ptr < buflen :
                    return True
                else :
                    self.ptr = None
                    try :
                        buflen = self.stream.read ( self.buflen )
                    except AttributeError :
                        pass
                    if buflen <= 0 :
                        return False
                return True
            def __next__ ( self ) :
                if self.ptr < self.buflen :
                    return True
                else :
                    return False
            def is_printable_char ( c ) :
                return 33 <= c <= 126
            def skip_unprintable ( self ) :
                while self.ptr < self.buflen and not is_printable_char ( self.stream.read ( self.ptr ) ) :
                    self.ptr += 1
            def next ( self ) :
                self.skip_unprintable ( )
                return self.ptr
        def __next__ ( self ) :
            if not self.hasNext ( ) :
                raise StopIteration
            yield self.next ( )
    return FastScanner ( ).__next__ ( )
