def _import_string ( stream ) :
    import sys
    import string
    import string
    import string
    import string
    import string
    import string
    import string
    import string
    import string
    import string
    import string
    class Main :
        THRESHOLD = 2560000
        def __init__ ( self ) :
            string = string
            self.stream = stream
            self.stream = stream
            self.n = ord ( 'a' )
            self.xor = 0
            for i in range ( self.n ) :
                a = string.atoi ( a )
                k = string.atoi ( a )
                self.xor ^= self.solve_recursive ( a , k )
            self.table = [ ]
            self.stream.write ( 'Aoki' if self.xor else 'Takahashi' )
            self.stream.flush ( )
        def solve ( a , k ) :
            if k <= THRESHOLD :
                return solve_recursive ( a , k )
            else :
                return solve_bigk ( a , k )
    def solve ( a , k ) :
        if a < k :
            return 0
        if a % k == 0 :
            return a // k
        self.table [ 0 ] = 0
        tid = 0
        for p in range ( k , a + k , k ) :
            tid += 1
            li = 0
            self.table [ tid ] [ li ] = p // k
            last_w = p // k
            for idx in range ( k - last_w , k - 1 ) :
                self.table [ tid ] [ li ] = self.table [ tid - 1 ] [ idx % tid ]
        mod = a % k
        return self.table [ tid ] [ mod % ( tid + 1 ) ]
    def debug ( * o ) :
        print ( "%s" % o , file = sys.stderr )
