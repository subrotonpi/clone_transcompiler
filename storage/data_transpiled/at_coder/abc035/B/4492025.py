def _import ( ) :
    from sys import stdin
    from .py3compat import PY3
    class Main ( object ) :
        def __init__ ( self , sc ) :
            super ( Main , self ).__init__ ( sc )
            S = sc.next ( )
            T = ord ( S [ 0 ] )
            x , y = 0 , 0
            q = 0
            for c in S :
                if c == 'L' :
                    x -= 1
                elif c == 'R' :
                    x += 1
                elif c == 'U' :
                    y += 1
                elif c == 'D' :
                    y -= 1
                elif c == '?' :
                    q += 1
            if T == 1 :
                print ( d ( x , y ) + q )
            elif T == 2 :
                if d ( x , y ) >= q :
                    print ( d ( x , y ) - q )
                else :
                    print ( ( q - d ( x , y ) ) % 2 )
        def d ( x , y ) :
            return abs ( x ) + abs ( y )
    class FastScanner ( object ) :
        def __init__ ( self , buffer ) :
            self.buffer = buffer
            self.ptr = 0
            self.buflen = 0
            def has_next_byte ( self ) :
                if self.ptr < self.buflen :
                    return True
                else :
                    self.ptr = 0
                    try :
                        self.buflen = len ( buffer )
                    except TypeError :
                        pass
                    if self.buflen <= 0 :
                        return False
                return True
            def read_byte ( self ) :
                if self.ptr < self.buflen :
                    return self.buffer [ self.ptr ]
                else :
                    return - 1
            def is_printable_char ( c ) :
                return 33 <= c <= 126
            def skip_unprintable ( self ) :
                while self.ptr < self.buflen and not is_printable_char ( self.buffer [ self.ptr ] ) :
                    self.ptr += 1
        def next ( self ) :
            if self.ptr < self.buflen :
                return self.buffer [ self.ptr ]
            else :
                return False