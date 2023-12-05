def _import ( ) : return [ ]
class Main ( ) :
    def __init__ ( self ) :
        super ( Main , self ).__init__ ( )
        self.seq = [ ]
    def read ( self ) :
        sc = FastScanner ( )
        self.T = sc.__next__ ( )
        N = sc.__next__ ( )
        A = [ ]
        for i in range ( N ) :
            A.append ( sc.__next__ ( ) )
        self.N = N
        if self.N < N :
            raise ValueError
        while True :
            if '0' <= b <= '9' :
                n *= 10
            elif not self.isPrintableChar ( b ) :
                return ( - n )
            else :
                raise ValueError
        b = read_byte ( )
        if not self.hasNext ( ) :
            raise StopIteration
        n = False
        if self.N < N :
            n *= 10
        elif not self.isPrintableChar ( b ) :
            return ( - n )
        else :
            raise StopIteration
    def read ( self ) :
        return self.N
    def write ( self , data ) :
        if not self.hasNext ( ) :
            raise StopIteration
        data = data.read ( )
        self.ptr = 0
        self.buflen = 0
        def has_next_byte ( ) :
            if self.ptr < self.buflen :
                return True
            else :
                self.ptr = 0
                try :
                    buflen = self.buflen [ self.ptr ]
                except KeyError :
                    pass
                if self.buflen <= 0 :
                    return False
            return True
        def read ( self ) :
            if self.ptr < self.buflen :
                raise StopIteration
            data = data.read ( self.ptr )
            self.ptr += 1
    def write ( self , data ) :
        if not self.hasNext ( ) :
            raise StopIteration
    def write ( self , data ) :
        if self.ptr < self.buflen :
            return False
