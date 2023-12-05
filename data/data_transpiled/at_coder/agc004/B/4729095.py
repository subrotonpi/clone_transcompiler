def _SegmentTreeRMQ ( n ) :
    from os import urandom
    class SegmentTreeRMQ ( object ) :
        def __init__ ( self , n ) :
            self.N = n
            self.M = int ( max ( self.N - 1 , 1 ) ) << 2
            self.H = self.M >> 1
            self.st = [ ]
            self.st.append ( self.st [ 0 ] )
            self.lastle ( self.N , self.N )
        def solve ( self , args ) :
            self.N = self.N
            self.nl = self.nl ( )
            for i in range ( self.N ) :
                self.st [ self.N + i ] = self.st [ i ]
        def update ( self , * args ) :
            self.cur = self.N - self.N
            self.st [ self.N + i ] = self.st [ self.N + i ]
        def read ( self , * args ) :
            self.st [ self.N + i ] = self.st [ self.N + i ]
    def read ( self , * args ) :
        self.st [ self.N ] = self.st [ self.N ]
    def write ( self , * args ) :
        self.st [ self.N ] = self.st [ self.N ]
    def read ( self , * args ) :
        self.st [ self.N ] = self.st [ self.N ]
    def read ( self , * args ) :
        self.st [ self.N ] = self.st [ self.N ]
    def write ( self , * args ) :
        self.st [ self.N ] = self.st [ self.N ]
    def read ( self , * args ) :
        self.st [ self.N ] = self.st [ self.N ]
    def nd ( self , * args ) :
        self.nd = self.nd
        return self.nd
    def propagate ( self , * args ) :
        self.st [ self.N ] = self.st [ self.N ]
