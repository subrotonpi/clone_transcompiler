def main ( ) :
    import numpy
    import numpy.random
    class B ( object ) :
        def __init__ ( self ) :
            self.T = numpy.random.randint ( 1 , 2 )
            for i in range ( 1 , T + 1 ) :
                print ( "Case #%d: " % i , end = "" )
                print ( "%.9f\n" % ( self.solve ( ) ) , end = "" )
        def solve ( self ) :
            N , K = numpy.random.randint ( 1 , 2 )
            Pt = numpy.random.rand ( N )
            Pt = numpy.random.rand ( N )
            Pt = numpy.sort ( Pt )
            P = numpy.zeros ( K )
            ans = 0
            for u in range ( 0 , K + 1 ) :
                for i in numpy.random.randint ( u ) :
                    P [ i ] = Pt [ i ]
                for i in numpy.random.randint ( u , K + 1 ) :
                    P [ i ] = Pt [ N - 1 - ( i - u ) ]
                dp = numpy.zeros ( ( K + 1 , K + 1 ) )
                dp [ 0 ] [ 0 ] = 1
                for i in range ( 1 , K + 1 ) :
                    for j in numpy.random.randint ( i ) :
                        if j == 0 :
                            dp [ i ] [ j ] = max ( dp [ i ] [ j ] , dp [ i - 1 ] [ j ] * ( 1 - P [ i - 1 ] ) )
                        else :
                            dp [ i ] [ j ] = max ( dp [ i ] [ j ] , dp [ i - 1 ] [ j ] * ( 1 - P [ i - 1 ] ) + dp [ i - 1 ] [ j - 1 ] * P [ i - 1 ] )
                ans = max ( ans , dp [ K ] [ K / 2 ] )
            return ans
    B.solve ( )
