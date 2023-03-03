def _import ( ) :
    from sys import stdin as stream
    class Main ( object ) :
        def __init__ ( self , * args ) :
            super ( Main , self ).__init__ ( * args )
        def read ( self ) :
            sc = stream.read ( self.size )
            N = sc.find ( '-' )
            if N <= 59 :
                print ( 'Bad' )
            elif N <= 89 :
                print ( 'Good' )
            elif N <= 99 :
                print ( 'Great' )
            else :
                print ( 'Perfect' )
    class FastScanner ( object ) :
        def __init__ ( self , stream ) :
            stream.read ( self.size )
        def read ( self ) :
            if self.ptr < self.buflen :
                return True
            else :
                self.ptr = 0
                try :
                    buflen = stream.read ( self.size )
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
            while self.ptr < self.ptr and not is_printable_char ( self.ptr ) :
                self.ptr += 1
        def __iter__ ( self ) :
            return self.ptr
        def next ( self ) :
            if not self.ptr :
                raise StopIteration
            s = [ ]
            b = self.read ( self.size )
            while self.ptr :
                s.append ( b )
                b = self.read ( self.size )
            return s
        def read ( self ) :
            if not self.ptr :
                raise StopIteration
            n = 0
            minus = False
            b = self.read ( self.size )
            if b == '-' :
                minus = True
                b = self.read ( self.size )
            if b < '0' or b <= '9' :
                raise StopIteration
            while True :
                if self.ptr <= n :
                    n *=