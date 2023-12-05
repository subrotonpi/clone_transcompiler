def _import ( ) :
    from sys import stdout
    from io import BytesIO
    class Main ( object ) :
        def __init__ ( self ) :
            stream = stdout.write
            ci = _console_input ( )
            a , b = ci.next ( ) , ci.next ( )
            if len ( a ) > len ( b ) : stream.write ( a )
            else : stream.write ( b )
            stream.flush ( )
    class ConsoleInput ( object ) :
        def __init__ ( self , stream ) :
            self.stream = stream
        def read ( self ) :
            return self.stream.read ( )
        def has_next_byte ( self ) :
            if self.cnt < self.buffers :
                return True
            else :
                cnt = 0
                try :
                    buffers = self.stream.read ( self.cnt )
                except IndexError :
                    pass
                if len ( buffers ) <= 0 :
                    return False
            return True
        def read ( self ) :
            if self.cnt < self.buffers :
                return self.stream.read ( self.cnt )
            else :
                return - 1
        def is_printable_char ( c ) :
            return 33 <= c <= 126
        def skip_unprintable ( self ) :
            while self.cnt < self.buffers and not is_printable_char ( self.stream.read ( self.cnt ) ) :
                cnt += 1
        def __iter__ ( self ) :
            return self.stream.read ( self.cnt )
        def __next__ ( self ) :
            if not self.hasNext ( ) :
                raise StopIteration
            s = [ ]
            b = self.stream.read ( 1 )
            while self.count ( b ) == 0 :
                s.append ( b )
                b = self.stream.read ( 1 )
            return s
        def __next__ ( self ) :
            if not self.hasNext ( ) :
                raise StopIteration
            n = 0
            minus = False
            b = self.stream.read ( 1 )
            if b == '-' :
                minus = True
                b = self.stream.read ( 1 )
            if b == '' :
                return - n
            while True :
                if minus :