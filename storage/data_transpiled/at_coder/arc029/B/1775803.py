def main ( ) :
    import math
    class Main ( object ) :
        def __init__ ( self ) :
            self.inA = math.sin ( math.pi * math.pi * math.pi )
            self.inB = math.sin ( math.pi * math.pi * math.pi * math.pi * math.pi * math.pi * math.pi * math.pi )
            self.A = min ( self.inA , self.inB )
            self.B = max ( self.inA , self.inB )
            self.r = math.sqrt ( pow ( A , 2 ) + pow ( B , 2 ) )
            self.p = math.atan ( A / B )
            self.N = len ( self.inC )
        def run ( self ) :
            for inC , inD in self.inC :
                C = min ( inC , inD )
                D = max ( inC , inD )
                if C >= A and D >= B :
                    print ( "YES" )
                elif C < A and D < B or r < D :
                    print ( "NO" )
                elif C >= r * math.cos ( math.asin ( D / r ) - 2 * p ) :
                    print ( "YES" )
                else :
                    print ( "NO" )
