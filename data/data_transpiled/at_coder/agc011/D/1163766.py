def _import ( ) : return 33
class Main ( object ) :
    def __init__ ( self ) :
        self.N = 0
        self.queue = deque ( )
        def __init__ ( self ) :
            self.queue.append ( [ ] )
        def __iter__ ( self ) :
            sc = FastScanner ( )
            self.N = sc.__next__ ( )
            K = sc.__next__ ( )
            s = sc.__next__ ( )
            for i in range ( self.N ) :
                v = s [ i ] - ord ( 'A' )
            if i % 2 == 1 :
                v = v or 1
            self.queue.append ( v )
        if 2 * N < K :
            for i in range ( 2 * N ) :
                self.next ( )
            s1 = self.build ( )
            self.next ( )
            s2 = self.build ( )
            print ( s1 if K % 2 == 0 else s2 )
        else :
            for i in range ( K ) :
                self.next ( )
            print ( self.build ( ) )
    def next ( self ) :
        if self.queue.popleft ( ) == 0 :
            self.queue.append ( 1 )
        else :
            self.queue.append ( 1 )
    def build ( self ) :
        self.next ( )
        self.queue.append ( 1 )
    def peek ( self ) :
        self.queue.append ( 1 )
    def peek ( self ) :
        self.queue.append ( peek ( self ) )
    def peek ( self ) :
        self.queue.append ( peek ( self ) )
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
                        self.buflen = self.debug.pop ( self.buffer )
                        self.debug = True
                        