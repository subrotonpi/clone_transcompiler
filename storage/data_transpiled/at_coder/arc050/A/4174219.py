def _import ( ) :
    from sys import stdin as stream
    from struct import Struct
    class Main ( object ) :
        def __init__ ( self , * args ) :
            super ( Main , self ).__init__ ( * args )
            self.K = [ ]
        def read ( self ) :
            sc = stream.read ( self.K )
            S = sc.get ( 'S' )
            s = sc.get ( 's' )
            S = S.lower ( )
            if S == s :
                print ( 'Yes' )
            else :
                print ( 'No' )
    class FastScanner ( object ) :
        def __init__ ( self , stream ) :
            self.stream = stream
        def read ( self ) :
            self.stream.seek ( 0 )
            self.ptr = 0
            self.buflen = 0
            def has_next_byte ( ) :
                if self.ptr < self.buflen :
                    return True
                else :
                    self.ptr = 0
                    try :
                        buflen = stream.read ( self.buflen )
                    except AttributeError :
                        pass
                    if self.buflen <= 0 :
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
            def __next__ ( self ) :
                return self.ptr
        def read ( self ) :
            if not self.hasNext ( ) :
                raise StopIteration
            s = [ ]
            b = read_byte ( self )
            while b == '-' :
                minus = True
                b = read_byte ( self )
            if b < '0' or b <= '9' :
                raise ValueError
            while True :
                if self.ptr <= self.buflen :
                    n *= 10
                    n += b - '0'
                elif not is_printable_char ( b ) :
                    return - n
                else :
                    raise StopIteration
    return Main
    