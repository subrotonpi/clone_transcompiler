def main ( ) :
    import math
    class Main ( object ) :
        def __init__ ( self ) :
            self.A = float ( self.A )
            self.B = float ( self.B )
            self.C = float ( self.C )
            self.PI = 3.1415926535897932384626d
    if A - B >= 0 :
        min = 0.
        max = 100d
        while abs ( A * min + B * math.sin ( C * pi * min ) - 100d ) > 0.0000001 :
            middle = ( min + max ) / 2
            if A * middle + B * math.sin ( C * pi * middle ) - 100d < 0 :
                min = middle
            else :
                max = middle
        print ( min )
    else :
        ni_pi = 1 / ( 2 * C )
        if A * ni_pi + B * math.sin ( C * pi * ni_pi ) - 100d > 0 :
            min = 0.
            max = ni_pi
            while abs ( A * min + B * math.sin ( C * pi * min ) - 100d ) > 0.00000001 :
                middle = ( min + max ) / 2
                if A * middle + B * math.sin ( C * pi * middle ) - 100d < 0 :
                    min = middle
                else :
                    max = middle
            print ( min )
        else :
            counter = 1
            min = 0
            max = 0
