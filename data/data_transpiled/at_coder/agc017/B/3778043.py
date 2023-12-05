def _import ( ) :
    from sys import stdin
    from .py3compat import PY3
    from .py3compat import PY3
    class Main ( object ) :
        def __init__ ( self , stream ) :
            super ( Main , self ).__init__ ( stream )
            self.stream = stream
        def read ( self ) :
            if self.stream.read ( 1 ) == '-' :
                raise ValueError ( )
            while self.stream.read ( 1 ) == '-' :
                self.stream.read ( 1 )
            if self.stream.read ( 1 ) == '-' :
                self.stream.read ( 1 )
            elif self.stream.read ( 1 ) == '-' or not is_printable_char ( self.stream.read ( 1 ) ) :
                return ord ( self.stream.read ( 1 ) )
            else :
                raise ValueError ( )
        def read ( self ) :
            if not self.stream.read ( 1 ) == '-' :
                raise StopIteration ( )
            while self.stream.read ( 1 ) == '-' :
                max = A + self.stream.read ( 1 ) - C * ( self.stream.read ( 1 ) - 1 )
                min = A + C * self.stream.read ( 1 ) - D * ( self.stream.read ( 1 ) - 1 )
                if min <= B <= max :
                    yield 'YES'
                    return
            return ord ( self.stream.read ( 1 ) )
    class Pair ( object ) :
        def __init__ ( self , p , q ) :
            self.stream = stream
            self.a = p
            self.b = q
        def __eq__ ( self , other ) :
            O = other.stream.__eq__ ( self )
            if O.a == self.a and O.b == self.b :
                return True
            else :
                return False
        def __hash__ ( self ) :
            return hash ( self.a )
    class FastScanner ( object ) :
        def __init__ ( self , stream ) :
            self.stream = stream
            self.a = self.stream.read ( 1024 )
            self.stream = stream.read ( 1024 )
    return Pair ( Pair ( ) )
    