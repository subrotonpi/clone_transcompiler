def _import ( ) :
    from StringIO import StringIO
    from sys import stdin
    if stdin.isatty ( ) :
        print ( "ABC" )
    else :
        print ( "chokudai" )
    class FastScanner ( object ) :
        def __init__ ( self , stream ) :
            self.stream = stream
        def read ( self ) :
            self.stream.seek ( 0 )
            self.stream.seek ( 0 )
            self.stream.read ( )
        def has_next_byte ( self ) :
            if self.stream.seek ( 0 ) < self.stream.tell ( ) :
                return True
            else :
                self.stream.seek ( 0 )
                self.stream.seek ( 0 )
        def has_next_byte ( self ) :
            if self.stream.read ( ) < self.stream.tell ( ) :
                return True
            else :
                self.stream.seek ( 0 )
        def read_byte ( self ) :
            if self.stream.read ( ptr ) < self.stream.tell ( ) :
                return self.stream.read ( ptr )
            else :
                return - 1
        def is_printable_char ( c ) :
            return 33 <= c <= 126
        def __iter__ ( self ) :
            while self.stream.read ( ptr ) < self.stream.tell ( ) :
                self.stream.seek ( ptr )
            return iter ( self )
        def next ( self ) :
            if not self.stream.read ( ptr ) :
                raise StopIteration
            s = [ ]
            b = read_byte ( self )
            while is_printable_char ( b ) :
                s.append ( b )
                b = read_byte ( self )
            return s
        def read ( self ) :
            if not self.stream.read ( ptr ) :
                raise StopIteration
            n = 0
            minus = False
            b = read_byte ( self )
            if b == '-' :
                minus = True
                b = read_byte ( self )
            if b < '0' or b > '9' :
                raise ValueError
            while True :
                if b == - 1 or not is_printable_char ( b ) :
                    return - n
                else :
                INDENT