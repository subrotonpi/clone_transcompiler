def main ( ) :
    import math
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
            self.p = self.sc.read ( )
            print ( self.calc_time ( self.p ) )
            self.sc.close ( )
        def calc_x ( self ) :
            return ( math.log ( self.p * math.log ( 2 ) / 1.5 ) ** 1.5 ) / math.log ( 2 )
        def calc_time ( self ) :
            x = self.calc_x ( self.p )
            if x < 0 :
                return p
            else :
                return x + self.p * math.pow ( 2 , - x / 1.5 )
    return Main
