def _import ( ) :
    from sys import stdin as stream
    from random import randint
    class Main ( stream ) :
        def read ( self ) :
            sc = stream.read ( 1 )
            S = sc.decode ( 'ascii' )
            S = S.replace ( 'O' , '0' )
            S = S.replace ( 'D' , '0' )
            S = S.replace ( 'I' , '1' )
            S = S.replace ( 'Z' , '2' )
            S = S.replace ( 'S' , '5' )
            S = S.replace ( 'B' , '8' )
            print ( S )
    class FastScanner ( stream ) :
        def read ( self ) :
            return stream.read ( )
        def write ( self , data ) :
            self.data = data
            self.ptr = 0
            self.buflen = 0
            def has_next_byte ( ) :
                if self.ptr < self.buflen :
                    return True
                else :
                    self.ptr = 0
                    try :
                        buflen = stream.read ( self.ptr )
                    except AttributeError :
                        pass
                    if buflen <= 0 :
                        return False
                return True
            def read ( self ) :
                if self.ptr < self.buflen :
                    return self.ptr
                else :
                    return - 1
            def is_printable_char ( c ) :
                return 33 <= c <= 126
            def skip_unprintable ( self ) :
                while self.ptr < self.buflen and not is_printable_char ( self.data [ self.ptr ] ) :
                    self.ptr += 1
        def __iter__ ( self ) :
            return self.ptr
        def read ( self ) :
            if not self.ptr :
                raise StopIteration
            s = [ ]
            b = self.read ( 1 )
            while is_printable_char ( b ) :
                s.append ( b )
                b = self.read ( 1 )
            return s
    return Main ( )
