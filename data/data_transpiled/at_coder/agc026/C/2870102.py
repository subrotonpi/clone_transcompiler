def _import ( ) :
    from itertools import count
    from itertools import chain
    from itertools import chain
    from os import urandom
    from itertools import chain
    class Main ( object ) :
        def __init__ ( self ) :
            self.stream = sys.stdin
            self.stream = sys.stdout
            self.stream.read ( 1 )
        def __iter__ ( self ) :
            return iter ( chain ( self.stream , self.stream ) )
    N = len ( sys.stdin.readline ( ) )
    str = sys.stdin.read ( 1 )
    S = chain ( [ S ] , [ ] )
    count = 0
    for i in range ( 1 << N ) :
        a = [ ]
        b = [ ]
        num = i
        for j in range ( N ) :
            bit = num & 1
            if bit == 0 :
                a.append ( S [ j ] )
            else :
                b.append ( S [ j ] )
            num >>= 1
        a.reverse ( )
        b.reverse ( )
        aa = chain ( * a )
        bb = chain ( * b )
        count += count ( S , aa , bb )
    print ( count )
    def _zip ( lst ) :
        res = [ ]
        for i in lst :
            res.append ( i )
        return res
    def count ( s , a , b ) :
        n = len ( s ) // 2
        dp = [ [ 0 ] * ( len ( s ) - 1 ) for i in range ( len ( a ) + 1 ) ]
        for j in range ( len ( b ) + 1 ) :
            for i in range ( len ( a ) + 1 ) :
                if i > 0 and s [ n + i + j - 1 ] == a [ i - 1 ] :
                    dp [ i ] [ j ] += dp [ i - 1 ] [ j ]
                if j > 0 and s [ n + i + j - 1 ] == b [ j - 1 ] :
                    dp [ i ] [ j ] += dp [ i ] [ j - 1 ]
        return dp
    return Main ( )
