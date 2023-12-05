def _import ( ) :
    from math import factorial
    from math import log
    from math import log
    class GCJ_10_Qual_B ( object ) :
        def __init__ ( self ) :
            self.C = 0
            self.N = 2000
        def __call__ ( self , s ) :
            s = input ( )
            self.C = s.n
            for cs in range ( 1 , C + 1 ) :
                N = s.n
                for i in range ( N ) :
                    self.T [ i ] = s.next ( )
    class GCJ_10_Qual_B ( object ) :
        def __init__ ( self ) :
            self.C = 0
            self.N = 0
        def __call__ ( self , s ) :
            s = input ( )
            self.C = s.n
            for cs in range ( 1 , C + 1 ) :
                self.N = s.n
                for i in range ( N ) :
                    self.T [ i ] = s.next ( )
    ggt = factorial ( 0 )
    T = [ x for x in T [ : N ] if x > 0 ]
    for i in range ( N - 1 ) :
        ggt = ggt.gcd ( T [ i + 1 ] - T [ i ] )
    res = ggt - T [ 0 ] % ggt
    print ( "Case #%d: %s" % ( cs , res ) )
