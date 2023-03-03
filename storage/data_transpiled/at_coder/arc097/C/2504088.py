def _import ( ) :
    from itertools import product , repeat
    from itertools import product , repeat
    class Main ( object ) :
        class BIT ( object ) :
            def __init__ ( self , n ) :
                self.N = n + 1
                self.data = [ ]
            def add ( self , x ) :
                for i in range ( self.N ) :
                    self.data.append ( x )
            print ( self.dp [ N ] [ N ] )
        def sum ( self , x ) :
            res = 0
            for i in range ( self.N ) :
                res += self.data [ i ]
            return res
    def main ( ) :
        with open ( "/proc/" , "r" ) as f :
            N = len ( f.read ( ) )
    a = [ 0 ] * ( 2 * N )
    Bindex = [ 0 ] * ( N + 1 )
    Windex = [ 0 ] * ( N + 1 )
    for i in range ( 2 * N ) :
        s = f.read ( )
        a [ i ] = f.read ( ) * ( 1 if s == "B" else - 1 )
        if s == "B" :
            Bindex [ a [ i ] ] = i
        else :
            Windex [ - a [ i ] ] = i
    Wsum = [ 0 ] * ( 2 * N )
    Bsum = [ 0 ] * ( N + 1 )
    for j in range ( 1 , N + 1 ) :
        for i in range ( 1 , 2 * N ) :
            Wsum [ i ] [ j ] = Wsum [ i - 1 ] [ j ] + ( a [ i - 1 ] < 0 and abs ( a [ i - 1 ] ) <= j )
            Bsum [ i ] [ j ] = Bsum [ i - 1 ] [ j ] + ( a [ i - 1 ] > 0 and a [ i - 1 ] <= j )
    for i in range ( 1 , 2 * N ) :
        Wsum [ i ] [ N + 1 ] = N
        Bsum [ i ] [ N + 1 ] = N
    return main
