def import _sys
class C ( object ) :
    GOAL = 1000000
    def __init__ ( self ) :
        self.N = len ( self.seq )
    def main ( self ) :
        for caseid in range ( 1 , N + 1 ) :
            M , p , X = self.seq [ 0 ]
            table = [ [ ] for _ in range ( 0 , M + 1 ) ]
            for i in range ( 0 , M ) :
                [ table [ i ].append ( - 1.0 ) ]
            unit = 1 << M
            table [ M ] [ 1 << M ] = 1.0
            table [ M ] [ 0 ] = 0.0
            for i in range ( M - 1 , - 1 , - 1 ) :
                unit /= 2
                for j in range ( 0 , 1 << M ) :
                    max = 0.0
                    if j / unit % 2 == 0 :
                        for k in range ( 0 , j - k ) :
                            val = p * table [ i + 1 ] [ j + k ] + ( 1.0 - p ) * table [ i + 1 ] [ j - k ]
                            max = max ( val )
                    else :
                        for k in range ( unit , j - k ) :
                            val = p * table [ i + 1 ] [ j + k ] + ( 1.0 - p ) * table [ i + 1 ] [ j - k ]
                            max = max ( val )
                    table [ i ] [ j ] = max
        self.seq [ 0 ] = int ( X * ( 1 << M ) / GOAL )
        print ( "Case #%d: %f" % ( caseid , self.seq [ 0 ] [ IX ] ) )
