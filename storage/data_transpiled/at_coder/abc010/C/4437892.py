def _import ( ) :
    from sys import stdin
    from .py3compat import PY3
    class Main ( object ) :
        def __init__ ( self ) :
            super ( Main , self ).__init__ ( )
            self.txa = ord ( 'a' )
            self.tya = ord ( 'b' )
            self.txb = ord ( 'a' )
            self.tyb = ord ( 'b' )
            self.T = ord ( 'T' )
            self.V = ord ( 'V' )
            N = ord ( 'N' )
            for i in range ( N ) :
                x = ord ( 'x' )
                y = ord ( 'y' )
                L1 = ( self.txa - x ) ** 2 + ( self.tya - y ) ** 2
                L2 = ( self.txb - x ) ** 2 + ( self.tyb - y ) ** 2
                can = self.T * self.V * self.V
                if self.can - L1 - L2 < 0 :
                    pass
                else :
                    if 4 * L1 * L2 <= ( self.can - L1 - L2 ) * ( self.can - L1 - L2 ) :
                        print ( 'YES' )
                        return
            print ( 'NO' )
    class FastScanner ( object ) :
        def __init__ ( self ) :
            self.buffer = sys.stdin.read ( 1024 )
            self.ptr = 0
            self.buflen = 0
            def has_next_byte ( self ) :
                if self.ptr < self.buflen :
                    return True
                else :
                    self.ptr = 0
                    try :
                        buflen = self.buffer.read ( self.ptr )
                    except AttributeError :
                        pass
                    if self.buflen <= 0 :
                        return False
                return True
            def __getattr__ ( self , attr ) :
                return attr
        def __getitem__ ( self , i ) :
            if not self.ptr :
                raise StopIteration
            else :
                return self.ptr
    return Main
