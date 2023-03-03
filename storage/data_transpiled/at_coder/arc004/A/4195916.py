def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        n = sc.number
        points = [ Point ( sc.x , sc.y ) for i in range ( n ) ]
        max = 0
        for i in range ( n ) :
            for j in range ( i + 1 , n ) :
                d = points [ i ].getDist2 ( points [ j ] )
                if max < d :
                    max = d
        print ( math.sqrt ( max ) )
    class Point ( object ) :
        def __init__ ( self , x , y ) :
            self.x = x
            self.y = y
        def getDist2 ( self , p ) :
            return ( x - p.x ) ** 2 + ( y - p.y ) ** 2
