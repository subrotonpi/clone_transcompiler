def round2 ( ) :
    import os
    import math
    import os
    import math
    import os
    import math
    class P3 ( object ) :
        def __init__ ( self ) :
            self.points = [ ]
            self.power = [ ]
        def fit ( self , p ) :
            self.points = [ p.x , p.y , p.z ]
            self.power = [ ]
            for i in range ( 1 , n + 1 ) :
                res = self.solve_one ( p )
                print ( "Case #%d: %f" % ( i , res ) )
                self.out.write ( "Case #%d: %f\n" % ( i , res ) )
    def score ( self ) :
        return math.sqrt ( math.pow ( self.points [ 0 ] , self.power [ 0 ] ) )
    def score ( self ) :
        return math.pow ( self.points [ 1 ] , self.power [ 1 ] )
    def score ( self ) :
        return math.pow ( self.points [ 0 ] , self.power [ 1 ] )
    def score ( self ) :
        return math.pow ( self.points [ 0 ] , self.power [ 1 ] )
    def score ( self ) :
        N = int ( self.points [ 0 ] )
        self.points = [ ]
        self.power = [ ]
        p = [ 0 , 0 , 0 ]
        for i in range ( N ) :
            parts = self.points [ i ].split ( 's+' )
            self.points.append ( ( float ( parts [ 0 ] ) , float ( parts [ 1 ] ) , float ( parts [ 2 ] ) ) )
            self.power.append ( int ( parts [ 3 ] ) )
            p.append ( self.points [ i ] [ 0 ] , self.points [ i ] [ 1 ] , self.points [ i ] [ 2 ] )
    p = [ p [ 0 ] / N , p [ 1 ] / N , p [ 2 ] / N ]
    for d in range ( 1000 , 1e-8 , 1e-8 ) :
        m = False
        while True :
            m = False
            s = score ( self )
            for dx in range ( -