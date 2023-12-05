def _import ( ) : return 33
class Main ( object ) :
    def __init__ ( self ) :
        self.N = 0
        self.K = 0
    def __init__ ( self , n , k , flg ) :
        if not self.hasNext ( ) :
            raise StopIteration
        self.dp = [ ]
        while self.hasNext ( ) :
            self.dp.append ( [ ] )
    def dfs ( n , k , flg ) :
        if self.dp [ n ] [ k ] [ flg ] >= 0 :
            return self.dp [ n ] [ k ] [ flg ]
        if k > self.N :
            return 0
        if n == self.N :
            return flg
        ret = 0
        ret += 1.0 * self.n / ( self.n + 1 ) * dfs ( self.n + 1 , k , flg )
        a = 1.0 / ( self.n + 1 ) * dfs ( self.n + 1 , k + 1 , 1 )
        b = 1.0 / ( self.n + 1 ) * dfs ( self.n + 1 , k , 0 )
        ret += max ( a , b )
        self.dp [ n ] [ k ] [ flg ] = ret
        return ret
    def main ( self ) :
        sc = FastScanner ( )
        self.N = sc.n
        self.K = sc.k
        for a in self.dp :
            for b in a :
                [ b ] = - 1
        ret = dfs ( 0 , 0 , 0 )
        print ( "%.12f" % ret )
class FastScanner ( object ) :
    def __init__ ( self , debug = None ) :
        self.debug = None
        self.stream = sys.stdin
        self.ptr = 0
        self.buflen = 0
        self.buffer = ''
        self.eos = False
        self.hasNext ( )
    def read ( self ) :
        if self.ptr < self.buflen :
            return True
        else :
            self.ptr = 0
            try :
                if self.debug :
                    self.debug = self.debug
                    self.eos = True
                elif self.debug :
                    self.debug = self.debug
        