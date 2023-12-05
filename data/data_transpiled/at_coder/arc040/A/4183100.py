def _import ( ) : return _import ( )
class Main ( object ) :
    def __init__ ( self , * args ) :
        sc = _FastScanner ( )
        N = sc.__next__ ( )
        r = 0
        b = 0
        for i in range ( N ) :
            S = sc.next ( )
            for j in range ( N ) :
                if S [ j ] == 'R' :
                    r += 1
                elif S [ j ] == 'B' :
                    b += 1
        if r > b :
            print ( "TAKAHASHI" )
        elif r < b :
            print ( "AOKI" )
        else :
            print ( "DRAW" )
    class FastScanner ( object ) :
        def __init__ ( self , buffer ) :
            self.buffer = buffer
        def __init__ ( self , ptr = 0 ) :
            self.buflen = 0
        def has_next_byte ( self ) :
            if self.ptr < self.buflen :
                return True
            else :
                self.ptr = 0
                try :
                    self.buflen = self.buffer.get ( self.ptr )
                except AttributeError :
                    pass
                if self.buflen <= 0 :
                    return False
            return True
        def __next__ ( self ) :
            if self.ptr < self.buflen :
                return True
            else :
                self.ptr += self.buflen
        def is_printable_char ( c ) :
            return 33 <= c <= 126
        def skip_unprintable ( self ) :
            while self.ptr < self.buflen and not is_printable_char ( self.ptr ) :
                self.ptr += 1
        def __next__ ( self ) :
            return self.ptr
        def __next__ ( self ) :
            if self.ptr < self.buflen :
                raise AttributeError
            s = [ ]
            b = self.next ( )
            while is_printable_char ( b ) :
                s.append ( b )
                b = self.next ( )
            return s
return Main ( )
