def _import ( ) : return _import ( )
class Main ( object ) :
    def __init__ ( self ) :
        super ( Main , self ).__init__ ( )
        self.seq = [ ]
    def read ( self ) :
        if not self.hasNext ( ) :
            raise StopIteration
        N = self.seq.count ( )
        C = [ ]
        num = [ ]
        for i in range ( N ) :
            C.append ( self.seq [ i ] )
        for i in range ( N ) :
            for j in range ( N ) :
                if i != j :
                    if C [ i ] % C [ j ] == 0 :
                        num [ i ] += 1
        ans = 0
        for i in range ( N ) :
            pos = num [ i ] // 2 + 1
            ans += float ( pos ) / ( num [ i ] + 1 )
        print ( ans )
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
                    self.buflen = self.buffer.read ( self.buflen )
                except AttributeError :
                    pass
                if self.buflen <= 0 :
                    return False
            return True
        def read ( self ) :
            if self.ptr < self.buflen :
                return self.ptr
            else :
                return False
        def startswith ( self ) :
            return "%%%s" % ( self.ptr , self.pos )
    def startswith ( self ) :
        if not self.hasNext ( ) :
            raise StopIteration
        s = [ ]
        b = self.next ( )
        while is_next_byte ( b ) :
            s.append ( b )
            b = self.next ( )
        return s
