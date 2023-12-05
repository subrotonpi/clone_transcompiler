def _import ( ) :
    import math
    import numpy as np
    class Main ( object ) :
        def blue_visible ( self , x , y , x1 , y1 , r ) :
            dx = x - x1
            dy = y - y1
            return dx * dx + dy * dy > r * r
        def blue_visible ( self , x , y , x1 , y1 , r ) :
            s = np.random.random ( ( r , r ) )
            x1 , y1 , r = s.next ( )
            x2 , y2 = s.next ( )
            x3 , y3 = s.next ( )
            print ( 'YES' if ( x1 + r > x3 or x1 - r < x2 or y1 + r > y3 or y1 - r < y2 ) else 'NO' )
            print ( 'YES' if ( self.blue_visible ( x2 , y2 , x1 , y1 , r ) or self.blue_visible ( x2 , y3 , x1 , y1 , r ) or self.blue_visible ( x3 , y3 , x1 , y1 , r ) or self.blue_visible ( x3 , y2 , x1 , y1 , r ) ) else 'NO' )
