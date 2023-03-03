def _ _ main _ _ ( ) :
    import math
    import random
    class WateringPlants ( object ) :
        class Point ( object ) :
            def __init__ ( self , x , y ) :
                self.x = x
                self.y = y
        def sqDist ( x1 , y1 , x2 , y2 ) :
            return ( x1 - x2 ) ** 2 + ( y1 - y2 ) ** 2
        def dist ( x1 , y1 , x2 , y2 ) :
            return math.sqrt ( sqDist ( x1 , y1 , x2 , y2 ) )
        def circleIntr ( x1 , y1 , r1 , x2 , y2 , r2 ) :
            d = dist ( x1 , y1 , x2 , y2 )
            if d > r1 + r2 or d < abs ( r1 - r2 ) :
                return [ ]
            a = ( r1 * r1 - r2 * r2 + d * d ) / 2 / d
            px = x1 + a * ( x2 - x1 ) / d
            py = y1 + a * ( y2 - y1 ) / d
            res = [ ( px + h * ( y2 - y1 ) / d , py - h * ( x2 - x1 ) / d ) , ( px - h * ( y2 - y1 ) / d , py + h * ( x2 - x1 ) / d ) ]
            return res
        def doMain ( ) :
            with open ( 'input.txt' , 'r' ) as sc :
                with open ( 'output.txt' , 'w' ) as pw :
                    caseCnt = sc.readline ( ).split ( ) [ 1 ]
                    for caseNum in range ( 1 , caseCnt + 1 ) :
                        print ( 'Solving case ' , caseNum )
                        N = sc.readline ( ).split ( ) [ 1 ]
                        X = [ ]
                        Y = [ ]
                        R = [ ]
                        for i in range ( N ) :
                            X.append ( sc.readline ( ) )
                            Y.append ( sc.readline ( ) )
                            R.append ( sc.readline ( ) )
    return WateringPlants ( )
