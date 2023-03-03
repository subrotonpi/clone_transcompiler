def round1b ( ) :
    import os
    import sys
    import sys
    import qual2011.Kattio
    class B ( object ) :
        def __init__ ( self ) :
            self.io = Kattio.Kattio ( open ( 'src/round1b/B-large-0.in' , 'rb' ) , open ( 'src/round1b/B-large-0.out' , 'wb' ) )
            cases = self.io.read ( )
            for i in range ( 1 , cases + 1 ) :
                self.io.write ( 'Case #%d: ' % i )
                B ( ).solve ( self.io )
    def solve ( self , io ) :
        C , D = io.read ( ) , io.read ( )
        vendor = [ ]
        for P , V in zip ( [ C , D ] , [ D , D ] ) :
            for i in range ( V ) :
                vendor.append ( long ( P ) * 2 )
        D *= 2
        vendor.sort ( )
        lo , hi = 0 , 2000000000000L
        iter = 0
        best = hi
        while hi > lo :
            x = ( hi + lo ) / 2
            allowed = vendor [ 0 ] - x
            ok = True
            for v in vendor :
                t = max ( allowed , v - x )
                if abs ( t - v ) > x :
                    ok = False
                    break
                allowed = t + D
            if ok :
                hi = x
                best = x
            else :
                lo = x + 1
            iter += 1
        io.write ( best / 2.0 )
    return B
