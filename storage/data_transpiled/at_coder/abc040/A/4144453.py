def _import ( ) :
    from sys import stdin as stream
    from .py3compat import is_printable , PY3
    class Main ( object ) :
        def __init__ ( self , stream ) :
            super ( Main , self ).__init__ ( stream )
            self.stream = stream
            self.stream.seek ( 0 )
            self.stream.seek ( 0 )
            self.stream.seek ( 0 )
            self.stream.read ( 1 )
    class FastScanner ( stream ) :
        def __init__ ( self , stream ) :
            stream.seek ( 0 )
            self.stream.seek ( 0 )
            self.stream.seek ( 0 )
            self.stream.seek ( 0 )
            self.stream.read ( 1 )
        def has_next_byte ( self ) :
            if self.stream.read ( 1 ) < self.stream.tell ( ) :
                return True
            else :
                self.stream.seek ( 0 )
                try :
                    self.stream.read ( 1 )
                except IndexError :
                    pass
                if self.stream.read ( 1 ) <= self.stream.tell ( ) :
                    return False
        def read_byte ( self ) :
            if self.stream.read ( 1 ) == b :
                return self.stream.read ( 1 )
            else :
                return b''
        def is_printable ( self ) :
            return 33 <= self.stream.read ( 1 ) <= 126
        def skip_unprintable ( self ) :
            while self.stream.read ( 1 ) == b :
                self.stream.seek ( 0 )
        def __next__ ( self ) :
            return self.stream.read ( 1 )
        def read ( self , * args ) :
            if self.stream.read ( 1 ) == b :
                return self.stream.read ( 1 )
            else :
                return b''
        def __next__ ( self ) :
            return self.stream.read ( 1 )
