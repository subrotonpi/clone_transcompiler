def _import ( ) :
    import sys
    import numpy as np
    class x :
        def __init__ ( self , xx , yy , zz ) :
            self.x = xx
            self.y = yy
            self.z = zz
        def __lt__ ( self , a ) :
            if self.y != a [ 1 ] : return y - a [ 1 ]
            if self.x != a [ 0 ] : return x - a [ 0 ]
            if self.z != a [ 2 ] : return z - a [ 2 ]
            return 0
    def main ( args ) :
        with open ( 'input.txt' , 'w' ) as infile , open ( 'output.txt' , 'w' ) as outfile :
            tcnt = sys.argv [ 1 ]
            for i in range ( 1 , tcnt + 1 ) :
                n = sys.argv [ 1 ]
                p = [ ]
                for a , b , c in [ ( a , b , c ) for a in [ 1 , 2 , 3 ] for b in [ 1 , 2 , 3 ] for c in [ 1 , 2 , 3 ] for a in [ 3 , 4 , 5 ] for b in [ 1 , 2 , 4 ] for c in [ 1 , 2 , 4 ] for a in [ 1 , 2 , 4 ] for b in [ 1 , 2 , 4 ] for c in [ 1 , 2 , 4 ] ] :
                    p.append ( ( a , b , c ) )
                p.sort ( )
                mx = 0
                for x in range ( 0 , 10000 ) :
                    T = np.zeros ( 10002 )
                    for j in range ( n ) :
                        if p [ j ] [ 0 ] <= x :
                            z = 10000 - p [ j ] [ 1 ] - x
                            for k in range ( 1 + p [ j ] [ 2 ] , 10001 ) :
                                T [ k ] += 1
                                if z >= 0 :
                                    sum = 0
                                    for k in range ( 1 + max ( 0 , z ) ) :
                                        sum += T [ k ]
                                    mx = max ( mx , sum )
                print ( "Case #%d: %d" % ( i , mx ) , file = outfile )
