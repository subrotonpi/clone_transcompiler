def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            n = int ( sc.readline ( ) )
            c = int ( sc.readline ( ) )
        def __init__ ( self ) :
            self.n = int ( sc.readline ( ) )
            self.c = int ( sc.readline ( ) )
            self.variation = [ [ 0 for i in range ( 2 , 10 ) ] for i in range ( n ) ]
            for i in range ( n ) :
                a = int ( sc.readline ( ) ) - 1
                self.variation [ i % 2 ] [ a ] += 1
        def max0 ( self ) :
            self.variation [ 0 ] = max ( self.variation [ 0 ] , 10 )
            self.variation [ 1 ] = max ( self.variation [ 1 ] , 10 )
            if self.variation [ 0 ] == self.variation [ 1 ] :
                max20 = self.variation [ 0 ]
                max21 = self.variation [ 1 ]
                print ( min ( ( ( self.n + 1 ) / 2 - max20 [ 0 ] + self.variation [ 0 ] ) * c , ( ( self.n + 1 ) / 2 - max0 [ 0 ] + self.variation [ 1 ] ) * c ) )
            else :
                print ( ( ( self.n + 1 ) / 2 - max0 [ 0 ] + self.variation [ 0 ] ) * c )
    def max2 ( self , n ) :
        temp = [ ]
        ret = [ ]
        if self.variation [ 0 ] < self.variation [ 1 ] :
            temp.append ( self.variation [ 0 ] )
            ret.append ( self.variation [ 1 ] )
        else :
            temp.append ( self.variation [ 0 ] )
            ret.append ( self.variation [ 1 ] )
    return Main
