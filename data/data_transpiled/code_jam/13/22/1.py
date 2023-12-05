def round1b ( ) :
    import os
    import sys
    import kattio
    import os
    import sys
    import os
    import math
    class B ( object ) :
        def __init__ ( self ) :
            self.io = kattio.Kattio ( open ( 'src/round1b/B-large.in' , 'rb' ) , open ( 'src/round1b/B-large-0.out' , 'wb' ) )
            cases = self.io.read ( )
            for i in range ( 1 , cases + 1 ) :
                self.io.write ( 'Case #%d: ' % i )
                B ( ).solve ( self.io )
            self.io.close ( )
        def solve ( self , io ) :
            n , x , y = self.io.read ( )
            if ( x + y ) % 2 or y < 0 :
                self.io.write ( '0.0' )
                return
            layer = ( abs ( x ) + y ) / 2
            sum , next = 0 , 1
            for i in range ( layer ) :
                sum += next
                next += 4
            before_layer = sum
            if n <= before_layer :
                self.io.write ( '0.0' )
                return
            n -= before_layer
            if n >= next :
                self.io.write ( '1.0' )
                return
            if x == 0 :
                if n < next :
                    self.io.write ( '0.0' )
                else :
                    self.io.write ( '1.0' )
                return
            self.memo = np.zeros ( ( y + 2 , layer * 2 + 1 ) )
            self.io.write ( go ( y + 1 , 0 , n , layer * 2 ) )
        def go ( self , left , right , n , max_size ) :
            if left == 0 :
                return 1.0
            if n == 0 :
                return 0.0
            if self.memo [ left ] [ right ] > 0.0 :
                return self.memo [ left ] [ right ] - 1.0
            if right == max_size :
                val = go ( self , left - 1 , right , n - 1 , max_size )
            else :
                val = go ( self , left , right , n - 1 , max_size ) / 2.0