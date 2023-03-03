def _import ( ) :
    from sys import stdin
    from .py3compat import PY3
    class Main ( object ) :
        def __init__ ( self , * args ) :
            self._sc = FastScanner ( )
            self.x = 0
            self.y = 0
            self.q = 0
            S = self.next ( )
            L = len ( S )
            for i in range ( L ) :
                C = S [ i ]
                if C == 'L' :
                    self.x -= 1
                elif C == 'R' :
                    self.x += 1
                elif C == 'U' :
                    self.y += 1
                elif C == 'D' :
                    self.y -= 1
                else :
                    self.q += 1
        self.T = self.__next__
        if self.T == 1 :
            print ( abs ( self.x ) + abs ( self.y ) + self.q )
        else :
            l = abs ( self.x ) + abs ( self.y )
            if l > self.q :
                print ( l - self.q )
            else :
                print ( ( self.q - l ) % 2 )
    class FastScanner ( object ) :
        def __init__ ( self , * args ) :
            self.buffer = sys.stdin.read ( 1024 )
            self.ptr = 0
            self.buflen = 0
            def has_next_byte ( self ) :
                if self.ptr < self.buflen :
                    return True
                else :
                    self.ptr = 0
                    try : self.buflen = self.buffer.tell ( )
                    except AttributeError : pass
                    if self.buflen <= 0 :
                        return False
                return True
            def __next__ ( self ) :
                if self.ptr < self.buflen :
                    return True
                else :
                    return False
        def __next__ ( self ) :
            if self.ptr < self.buflen :
                return False
            else :
                return True
    return Main ( )
