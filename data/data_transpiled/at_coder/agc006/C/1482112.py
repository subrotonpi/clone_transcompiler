def _import ( * args ) : return _import ( None , _sys.modules [ __name__ ] , "" , os.getpid ( ) )
class Main ( object ) :
    def __init__ ( self ) :
        super ( Main , self ).__init__ ( * args )
        self._sys = sys.modules [ __name__ ]
    def __call__ ( self , * args ) :
        with open ( "/proc/%d/" % self.pid ) as f :
            N = len ( f.readlines ( ) )
            x = [ f.read ( ) ]
            d = [ x [ i ] - ( x [ i - 1 ] if i > 0 else 0 ) for i in range ( N ) ]
            M = len ( f.readlines ( ) )
            K = len ( f.readlines ( ) )
            a = [ f.read ( ) ]
            comb = [ 0 ] * M
            for i in range ( M ) :
                a.append ( f.read ( ) )
                del comb [ i ]
                tmp = comb [ a [ i ] ]
                comb [ a [ i ] ] = comb [ a [ i + 1 ] ]
                comb [ a [ i + 1 ] ] = tmp
        cur = [ i for i in range ( N ) ]
        for i in range ( N ) :
            cur [ i ] = i
        for i in range ( N ) :
            if K % 2 == 1 :
                cur = mul ( cur , comb )
        L = 0
        for i in range ( N ) :
            L += d [ cur [ i ] ]
            print ( L )
    def mul ( self , ord1 , ord2 ) :
        n = len ( ord1 )
        if ord1 != ord2 :
            raise AssertionError
        ret = [ ]
        for i in range ( n ) :
            ret.append ( ord1 [ i ] )
        return ret
