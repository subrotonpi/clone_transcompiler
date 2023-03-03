def _import ( ) :
    from itertools import count , repeat
    class Main ( object ) :
        def __init__ ( self ) :
            sc = FastScanner ( )
            hit = set ( )
            buy = set ( )
            for i in range ( 6 ) :
                hit.add ( sc.next ( ) )
            B = sc.next ( )
            for i in range ( 6 ) :
                buy.add ( sc.next ( ) )
            ans = 0
            for b in buy :
                if b in hit :
                    ans += 1
            if ans == 6 :
                print ( 1 )
            elif ans == 5 :
                if B in buy :
                    print ( 2 )
                else :
                    print ( 3 )
            elif ans == 4 :
                print ( 4 )
            elif ans == 3 :
                print ( 5 )
            else :
                print ( 0 )
    class FastScanner ( object ) :
        def __init__ ( self , buffer ) :
            self.buffer = buffer
            self.ptr = 0
            self.buflen = 0
            def has_next_byte ( ) :
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
            def read ( self ) :
                if self.ptr < self.buflen :
                    return self.buffer [ self.ptr ]
                else :
                    return False
            def startswith ( self , b ) :
                if self.ptr < self.buflen :
                    return False
                return self.ptr
        def startswith ( self , b ) :
            if b == '-' :
                minus = True
                b = ord ( b )
                while is_printable_char ( b ) :
                    self.pos += 1
                return b
    return Main
