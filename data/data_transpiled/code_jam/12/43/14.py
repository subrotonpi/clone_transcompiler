def _import ( ) :
    from random import randint
    from math import sin , cos , cos
    class C ( object ) :
        def __init__ ( self ) :
            self.N = randint ( 1 , N )
            self.x = [ sin ( i ) for i in range ( N - 1 ) ]
        def solve ( self ) :
            self.N = randint ( 1 , N )
            self.x = [ sin ( i ) for i in range ( N - 1 ) ]
            for i in range ( N - 1 ) :
                for j in range ( i ) :
                    if self.x [ j ] > self.x [ i ] and self.x [ j ] < x [ i ] :
                        print ( "Impossible" )
                        return
            h = [ ]
            random.seed ( 0 )
            while True :
                for i in range ( N ) :
                    h.append ( random.randint ( 1 , 100000000 + 1 ) )
                success = True
                for i in range ( N - 1 ) :
                    slope_max = sys.maxint
                    mi = 0
                    for j in range ( i + 1 , N ) :
                        slope = 1.0 * ( h [ j ] - h [ i ] ) / ( j - i )
                        if slope > slope_max :
                            slope_max = slope
                            mi = j
                    if mi != x [ i ] :
                        success = False
                        break
                if success :
                    for i in range ( N ) :
                        print ( h [ i ] , end = ' ' )
                        if i != N - 1 :
                            print ( ' ' , end = ' ' )
                    print ( )
                    return
    def main ( self ) :
        T = randint ( 1 , N )
        for i in range ( 1 , T + 1 ) :
            print ( 'Case #%d: ' % i , end = ' ' )
            solver = C ( )
            solver.solve ( )
