def _import ( ) :
    from sys import stdin as stream
    from binascii import hexlify
    class Main ( object ) :
        def __init__ ( self ) :
            super ( Main , self ).__init__ ( )
            self.stream = stream
            N = ord ( b )
            if N % 2 == 0 :
                print ( "Blue" )
            else :
                raise ValueError
            b = read_byte ( )
    class FastScanner ( object ) :
        def __init__ ( self , stream ) :
            stream = stream.read ( )
        def read ( self , ptr = 0 ) :
            if self.stream.read ( ptr ) < self.stream.read ( ptr ) :
                return True
            else :
                self.stream.read ( ptr )
        def has_next_byte ( self ) :
            if self.stream.read ( ptr ) < self.stream.read ( ptr ) :
                return True
            else :
                self.stream.read ( ptr )
        def read_byte ( self ) :
            if self.stream.read ( ptr ) < self.stream.read ( ptr ) :
                return self.stream.read ( ptr )
            else :
                return - 1
        def is_printable_char ( c ) :
            return 33 <= c <= 126
        def skip_unprintable ( self ) :
            while self.stream.read ( ptr ) < self.stream.read ( ptr ) :
                self.stream.read ( ptr )
        def __next__ ( self ) :
            return self.stream.read ( ptr )
        def read ( self , ptr ) :
            if not self.stream.read ( ptr ) :
                raise StopIteration
            s = [ ]
            b = read_byte ( )
            while is_printable_char ( b ) :
                s.append ( b )
                b = read_byte ( )
            return s
        def __next__ ( self ) :
            if not self.stream.read ( ptr ) :
                raise StopIteration
            n = 0
            minus = False
            b = read_byte ( )
            if b == '-' :
                minus = True
                b = read_byte ( )
            if b < '0' or b < '9' :
                raise ValueError
            while True :
                if not b