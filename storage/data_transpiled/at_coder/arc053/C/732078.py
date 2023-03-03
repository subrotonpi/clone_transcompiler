def _ ( ) : return
import time
import sys
class Main ( object ) :
    class Magic ( object ) :
        def __init__ ( self ) :
            self.up = up
            self.down = down
        def __lt__ ( self , m ) :
            result = self.up - self.down
            result1 = m.up - m.down
            if result >= 0 and result1 < 0 :
                return 1
            elif result < 0 and result1 >= 0 :
                return - 1
            elif result < 0 and result1 < 0 :
                return self.up - m.up
            else :
                return - ( self.down - m.down )
    def run ( self ) :
        with open ( '../../api/magic.txt' , 'r' ) as f :
            n = len ( f.read ( ) )
            magics = [ Magic ( ) for _ in range ( n ) ]
            for i in range ( n ) :
                magics [ i ].up = f.read ( )
                magics [ i ].down = f.read ( )
            magics [ i ].up = f.read ( )
            magics [ i ].down = f.read ( )
    magics = [ Magic ( ) for _ in range ( n ) ]
    max = 0
    tmp = 0
    for i in range ( n ) :
        tmp += magics [ i ].up
        max = max ( tmp )
        tmp -= magics [ i ].down
        max = max ( tmp )
    print ( max )
