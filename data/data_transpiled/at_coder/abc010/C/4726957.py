def main ( ) :
    import math
    class Main ( object ) :
        def __init__ ( self ) :
            self.txa = float ( self.txa )
            self.tya = float ( self.tya )
            self.txb = float ( self.txb )
            self.tyb = float ( self.tyb )
            self.t = int ( self.t )
            self.v = int ( self.v )
            self.n = int ( self.n )
            flag = "NO"
            for x1 , y1 in self.n :
                wark1 = math.sqrt ( math.pow ( x1 - self.txa , 2 ) + math.pow ( y1 - self.tya , 2 ) )
                wark2 = math.sqrt ( math.pow ( txb - self.txb , 2 ) + math.pow ( tyb - self.tyb , 2 ) )
                if self.v * t >= wark1 + wark2 :
                    flag = "YES"
            print ( flag )
