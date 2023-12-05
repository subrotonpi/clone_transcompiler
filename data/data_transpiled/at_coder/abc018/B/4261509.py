def _import ( ) :
    from sys import stdin
    from .py3compat import PY3
    class Main ( object ) :
        def __init__ ( self , stream ) :
            self.stream = stream
        def read ( self ) :
            S = self.stream.read ( 1 )
            N = self.stream.read ( 1 )
            c = S.decode ( 'ascii' )
            d = [ ]
            for i in range ( N ) :
                d = [ ]
                for j in range ( len ( S ) ) :
                    d.append ( c [ j ] )
            l = self.stream.read ( 1 )
            r = self.stream.read ( 1 )
            for j in range ( l - 1 , r ) :
                d.append ( c [ l + r - 2 - j ] )
            c = d
        for i in range ( len ( S ) ) :
            print ( c [ i ] , end = ' ' )
        print ( )
    class FastScanner ( object ) :
        def __init__ ( self , stream ) :
            self.stream = stream
            self.stream.read ( 1 )
        def read ( self ) :
            self.stream.read ( 1 )
        def has_next_byte ( self ) :
            if self.stream.read ( 1 ) < self.stream.read ( 1 ) :
                return True
            else :
                self.stream.read ( 1 )
        def has_next_byte ( self ) :
            if self.stream.read ( 1 ) < self.stream.read ( 1 ) :
                return True
            else :
                self.stream.read ( 1 )
        def is_printable_char ( self ) :
            return 33 <= self.stream.read ( 1 ) <= 126
        def skip_unprintable ( self ) :
            while self.stream.read ( 1 ) < self.stream.read ( 1 ) :
                self.stream.read ( 1 )
        def next ( self ) :
            if self.stream.read ( 1 ) < self.stream.read ( 1 ) :
                return False
            else :
                return self.stream.read ( 1 )
    return Main ( )
