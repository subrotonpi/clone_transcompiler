def round1 ( ) :
    import os
    import sys
    import kattio
    import os
    import sys
    import sys
    class A ( object ) :
        def __init__ ( self ) :
            self.io = kattio.io.Kattio ( open ( 'src/round1/A-large-0.in' , 'rb' ) , open ( 'src/round1/A-large-0.out' , 'wb' ) )
            cases = self.io.get_int ( )
            for i in range ( 1 , cases + 1 ) :
                self.io.write ( 'Case #%d: ' % i )
                A ( ).solve ( self.io )
            self.io.close ( )
        def solve ( self , io ) :
            n , sum = self.io.get_int ( ) , 0
            s = [ ]
            for i in range ( n ) :
                s.append ( io.get_int ( ) )
                sum += s [ i ]
            for i in range ( n ) :
                lo , hi = 0.0 , 1.0
                for j in range ( 200 ) :
                    x = ( lo + hi ) / 2
                    isc = s [ i ] + sum * x
                    left = 1 - x
                    for k in range ( n ) :
                        if k == i or s [ k ] > isc :
                            continue
                        y = ( isc - s [ k ] ) / sum
                        left -= y
                    if left < 0 :
                        hi = x
                    else :
                        lo = x
                if i > 0 :
                    self.io.write ( ' ' )
                self.io.write ( lo * 100.0 )
            self.io.write ( '\n' )
