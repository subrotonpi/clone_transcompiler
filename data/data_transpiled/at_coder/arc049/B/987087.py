def import _solve
class Main ( object ) :
    def __init__ ( self ) :
        sn = raw_input ( )
        N = len ( sn )
        x = [ ]
        y = [ ]
        c = [ ]
        def main ( self ) :
            for i in range ( N ) :
                x.append ( sn.__next__ ( ) )
                y.append ( sn.__next__ ( ) )
                c.append ( sn.__next__ ( ) )
        def solve ( self ) :
            l , h = 0 , math.pow ( 10 , 9 )
            for i in range ( 100 ) :
                m = ( l + h ) / 2
                if self.solve ( m ) :
                    h = m
                else :
                    l = m
            print ( "%.10f\n" % h )
        def solve ( self ) :
            for i in range ( N ) :
                for j in range ( i + 1 , N ) :
                    dy = abs ( y [ i ] - y [ j ] )
                    if dy > self.r / c [ i ] + self.r / c [ j ] :
                        return False
                    dx = abs ( x [ i ] - x [ j ] )
                    if dx > self.r / c [ i ] + self.r / c [ j ] :
                        return False
            return True
return Main
