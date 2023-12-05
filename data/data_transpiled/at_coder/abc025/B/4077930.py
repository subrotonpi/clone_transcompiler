def _import ( ) :
    from sys import stdin as stream
    from .py3compat import PY3
    class Main ( object ) :
        def __init__ ( self ) :
            stream = stream.read ( 1 )
        def __next__ ( self ) :
            return int ( next ( stream ) )
        def __next__ ( self ) :
            return int ( next ( stream ) )
        def __next__ ( self ) :
            return float ( next ( stream ) )
    def __next__ ( self ) :
        nl = next ( stream )
        if nl < sys.maxint or nl > sys.maxint :
            raise StopIteration
        return next ( stream )
    def nextDouble ( ) :
        return double ( next ( stream ) )
    X = 0
    for s in _import ( '' , '' ) :
        d = next ( stream )
        if d < A :
            d = A
        elif d > B :
            d = B
        if s == 'East' :
            X += d
        elif X < 0 :
            print ( 'West %d' % ( - X ) )
        else :
            print ( X )
    class FastScanner ( object ) :
        def __init__ ( self ) :
            self.stream = stream
        def read ( self ) :
            self.stream.seek ( 0 , 0 )
        def has_next_byte ( self ) :
            if self.stream.read ( 1 ) < self.stream.tell ( ) :
                return True
            else :
                self.stream.seek ( 0 )
                return False
        def __next__ ( self ) :
            if self.stream.read ( 1 ) < self.stream.tell ( ) :
                return True
            else :
                self.stream.seek ( 0 )
                return False
        def __next__ ( self ) :
            while self.stream.read ( 1 ) < self.stream.tell ( ) :
                self.stream.seek ( 0 )
    return Main ( )
