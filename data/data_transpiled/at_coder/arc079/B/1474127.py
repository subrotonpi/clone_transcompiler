def _import ( ) : return _fast_import ( )
class Main ( object ) :
    def __init__ ( self ) :
        sc = _fast_import ( )
        K = sc.next ( )
        if K == 0 :
            print ( 2 )
            print ( '1 1' )
        elif K == 1 :
            print ( 3 )
            print ( '1 0 3' )
        else :
            n = int ( min ( 50 , K ) )
            V = K // n
            U = K % n
            ans = [ ]
            for i in range ( n ) :
                if i < U :
                    ans.append ( n + V - 1 + ( n - U + 1 ) )
                else :
                    ans.append ( n + V - 1 - U )
            print ( n )
            ans = [ ]
            for i in range ( n ) :
                ans.append ( ans [ i ] )
            print ( ''.join ( ans ) )
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
                        self.buflen = self.stream.read ( self.buflen )
                except EOFError :
                    pass
                if self.buflen < 0 :
                    self.eos = True
                    return False
                elif self.buflen == 0 :
                    return False
        def read_char ( self ) :
            if self.has_next_byte ( ) :
                return self.buffer [ ptr ]
            else :
                return - 1
    def is_printable_char ( self ) :
        return False
    def is_printable_char ( self ) :
        return True
