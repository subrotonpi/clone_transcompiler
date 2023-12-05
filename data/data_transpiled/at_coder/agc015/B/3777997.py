def _import ( ) : return _import ( )
class Main ( object ) :
    def __init__ ( self , args ) :
        sc = _FastScanner ( )
        S = sc.next ( )
        L = len ( S )
        p = [ ]
        for i in range ( L ) :
            if S [ i ] == 'U' :
                p.append ( 1 )
        ans = 0
        for i in range ( L ) :
            if p [ i ] == 0 :
                ans += - n if not is_printable_char ( i ) else n
            else :
                ans += i
            ans += L - 1
        print ( ans )
    class Pair ( object ) :
        def __init__ ( self , p , q ) :
            self.a = p
            self.b = q
        def __eq__ ( self , other ) :
            O = other.a
            if O.a == self.a and O.b == self.b :
                return True
            else :
                return False
        def __hash__ ( self ) :
            return hash ( self.a )
    class FastScanner ( object ) :
        def __init__ ( self , stream ) :
            self.stream = stream
            self.stream._buffer = [ ]
            self.ptr = 0
            self.buflen = 0
            def has_next_byte ( self ) :
                if self.ptr < self.buflen :
                    return True
                else :
                    self.ptr = 0
                    try :
                        self.buflen = stream._buffer [ self.ptr ]
                    except KeyError :
                        pass
                    if self.buflen <= 0 :
                        return False
                return True
            def __getitem__ ( self , key ) :
                if key in self.stream :
                    return self.stream [ key ]
                else :
                    return False
            def __len__ ( self ) :
                return len ( self.stream )
        def __getitem__ ( self , key ) :
            return self.stream [ key ]
return Main ( )
