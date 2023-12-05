def _calc_array ( x , op , forward ) :
    import sys
    import os
    import math
    import os
    import sys
    class Main ( object ) :
        def __init__ ( self , f ) :
            self.f = f
            self.x = x + 1
            self.y = y + 1
        def __repr__ ( self ) :
            return "%s %s" % ( self.x , self.y )
    class Operation ( object ) :
        def __init__ ( self , x , y ) :
            self.x = x + 1
            self.y = y + 1
        def __repr__ ( self ) :
            return "%s %s" % ( self.x , self.y )
    def calc_array ( x , op , forward ) :
        n = len ( op )
        if forward :
            for i in range ( n - 2 , - 1 , - 1 ) :
                op [ i ] += op [ i ]
        else :
            for i in range ( n - 1 , - 1 , - 1 ) :
                op [ i ] += op [ i ]
    def calc_array ( x , op , forward ) :
        n = len ( op )
        times = 0
        if forward :
            for i in range ( 1 , n ) :
                op [ i ] += op [ i - 1 ]
                op [ i ] += op [ i ]
        else :
            op [ i ] += op [ i ]
    return times
