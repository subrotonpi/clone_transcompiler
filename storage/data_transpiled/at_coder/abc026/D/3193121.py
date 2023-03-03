def main ( ) :
    import math
    class Main ( object ) :
        def __init__ ( self ) :
            self.A = float ( self.A )
            self.B = float ( self.B )
            self.C = float ( self.C )
    PI = 3.1415926535897932384626d
    min = 0.
    max = 100d
    while abs ( A * min + B * math.sin ( C * PI * min ) - 100d ) > 0.0000001 :
        middle = ( min + max ) / 2
        if A * middle + B * math.sin ( C * PI * middle ) - 100d < 0 :
            min = middle
        else :
            max = middle
    print ( min )
