def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.n = len ( sys.argv )
        self.coordinate = [ ( self.x , self.y , self.cost ) for x , y in sys.argv [ 1 : ] ]
        self.maxX = 0
        self.maxY = 0
        for i in range ( self.n - 1 ) :
            x1 , y1 , cost1 = self.coordinate [ i ]
            for x2 , y2 , cost2 in self.coordinate [ i ] :
                midX = abs ( x1 - x2 ) * cost1 / ( cost1 + cost2 ) * cost2
                midY = abs ( y1 - y2 ) * cost1 / ( cost1 + cost2 ) * cost2
                self.maxX = max ( self.maxX , midX )
                self.maxY = max ( self.maxY , midY )
        print ( max ( self.maxX , self.maxY ) )
class Coordinate ( object ) :
    x = float ( 'x' )
    y = float ( 'y' )
    cost = float ( 'cost' )
    def __init__ ( self , x , y , cost ) :
        self.x = x
        self.y = y
        self.cost = cost
