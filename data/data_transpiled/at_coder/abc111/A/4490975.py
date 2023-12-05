def _import ( ) :
    from StringIO import StringIO
    from sys import stdin
    from random import randint
    N = randint ( 1 , 1110 )
    print ( '-' * N )
    class MyScanner ( Scanner ) :
        def __init__ ( self , stream ) :
            Scanner.__init__ ( self , stream )
        def read ( self ) :
            self.stream = stream
            self.seek ( 0 )
            self.seek ( 0 )
            self.data = self.data
            self.ptr = self.offset
            self.buflen = None
            def has_next_byte ( ) :
                if self.ptr < self.buflen :
                    return True
                else :
                    self.ptr = self.offset
                    try :
                        buflen = self.stream.read ( self.buflen )
                    except AttributeError :
                        pass
                    if self.buflen <= 0 :
                        return False
                return True
            def read_byte ( self ) :
                if self.hasnext_byte ( ) :
                    return self.data [ self.ptr ]
                else :
                    return None
        def is_printable_char ( c ) :
            return 33 <= c <= 126
        def skip_unprintable ( self ) :
            while self.hasnext_byte ( ) and not is_printable_char ( self.data [ self.ptr ] ) :
                self.ptr += 1
        def __iter__ ( self ) :
            return iter ( self.data )
        def __next__ ( self ) :
            if not self.hasNext ( ) :
                raise StopIteration
            s = [ ]
            b = self.read_byte ( )
            while is_printable_char ( b ) :
                s.append ( b )
                b = self.read_byte ( )
            return s
        def __next__ ( self ) :
            if not self.hasNext ( ) :
                raise StopIteration
            n = 0
            minus = False
            b = self.read_byte ( )
            if b == '-' :
                minus = True
                b = self.read_byte ( )
            if b < '0' or b < '9' :
                raise ValueError
            while True :
                if '0' <= b <= '9' :
                    n *= 10
                    n += b - '0'
                elif b == - 1 or not is_printable_char ( b ) :