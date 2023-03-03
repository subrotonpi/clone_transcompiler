def main ( ) :
    import math
    class Main ( object ) :
        def __init__ ( self ) :
            self.x1 = float ( self.x1 )
            self.y1 = float ( self.y1 )
            self.x2 = float ( self.x2 )
            self.y2 = float ( self.y2 )
            self.x3 = float ( self.x3 )
            self.y3 = float ( self.y3 )
        def __call__ ( self ) :
            return math.fabs ( ( ( self.x1 - self.x3 ) * ( self.y2 - self.y3 ) ) - ( ( self.x2 - self.x3 ) * ( self.y1 - self.y3 ) ) )
    return Main
