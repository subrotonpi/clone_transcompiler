def import import math
class Main ( object ) :
    def __init__ ( self ) :
        self.m = Main ( )
    def run ( self ) :
        self.n = self.n
        x = [ ]
        y = [ ]
        for i in range ( self.n ) :
            x.append ( self.n [ i ] )
            y.append ( self.n [ i ] )
        rr = 10000000.0
        self.result = [ ]
        rad = 0
        steps = 500000
        for j in range ( steps ) :
            xx = math.cos ( rad ) * rr
            yy = math.sin ( rad ) * rr
            min_i = - 1
            min_d2 = 0
            for i in range ( self.n ) :
                d2 = ( xx * x [ i ] ) + ( yy * y [ i ] )
                if min_i == - 1 or min_d2 > d2 :
                    min_d2 = d2
                    min_i = i
            self.result += [ min_i ]
            rad += 2 * math.pi / steps
        for i in range ( self.n ) :
            print ( float ( self.result [ i ] ) / steps )
