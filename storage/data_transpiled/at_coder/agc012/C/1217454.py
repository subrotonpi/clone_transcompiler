def _import ( ) : return _import ( )
class Main ( object ) :
    def __init__ ( self ) :
        super ( Main , self ).__init__ ( )
        sc = FastScanner ( )
        N = sc.long ( )
        n = 0
        for n in range ( 40 ) :
            if N >= ( 1 << n ) - 1 :
                break
        list = [ ]
        for i in range ( 1 , n + 1 ) :
            list.append ( i )
        N -= ( 1 << n ) - 1
        for i in range ( n - 1 , - 1 , - 1 ) :
            if N & ( 1 << i ) :
                continue
            n += 1
            list.append ( i )
            N -= 1 << i
        list = [ ]
        for v in list :
            list.append ( v )
        for i in range ( 1 , len ( list ) + 1 ) :
            list.append ( i )
        print ( len ( list ) * 2 )
        print ( list [ 0 ] )
class FastScanner ( object ) :
    def __init__ ( self , debug = None ) :
        self.debug = None
        self.stream = sys.stdin
        self.ptr = 0
        self.buflen = 0
        self.buffer = ''
        self.eos = False
        def has_next_byte ( self ) :
            if self.ptr < self.buflen :
                return True
            else :
                self.ptr = 0
                try :
                    if self.debug :
                        self.buflen = len ( self.debug )
                        self.debug = ''
                        self.eos = True
                    else :
                        self.buflen = len ( self.buffer )
                except TypeError :
                    pass
                if self.buflen < 0 :
                    self.eos = True
                    return False
                elif self.buflen == 0 :
                    return False
            return True
        def read_char ( self ) :
            if self.has_next_byte ( ) :
                return self.buffer [ ptr ]
            else :
                return - 1
