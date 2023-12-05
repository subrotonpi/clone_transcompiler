def _import ( ) :
    from math import ceil
    from os import urandom
    class Main ( object ) :
        def __init__ ( self ) :
            self.fasta_stream = sys.stdin
        def read ( self ) :
            L = self.read_decimal ( )
            X = self.read_decimal ( )
            Y = self.read_decimal ( )
            S = self.read_decimal ( )
            D = self.read_decimal ( )
            P = D - S if S >= 0 else D - S + L
            N = L - P
            ans = P / ( X + Y )
            if Y > X :
                ans = min ( ans , N / ( Y - X ) )
            print ( ans )
    class FastScanner ( object ) :
        def __init__ ( self ) :
            self.fasta_stream = sys.stdin
        def read ( self ) :
            self.fasta_stream.read = sys.stdin.read
        def has_next_byte ( self ) :
            if self.ptr < self.buflen :
                return True
            else :
                self.ptr = 0
                try :
                    buflen = self.read_decimal ( )
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
            while self.ptr < self.buflen and not is_printable_char ( self.ptr ) :
                self.ptr += 1
        def __iter__ ( self ) :
            return iter ( self )
        def next ( self ) :
            if not self.hasNext ( ) :
                raise StopIteration
            s = [ ]
            b = self.read_decimal ( )
            while self.ptr < self.buflen :
                s.append ( b )
                b = self.read_decimal ( )
            return s
    return FastScanner ( ).__iter__ ( )
