def _import ( ) :
    import os
    import sys
    import os
    import sys
    import os
    import sys
    class C :
        def __init__ ( self , f , g ) :
            self.f = f
            self.g = g
        def dist ( self , b ) :
            xd = max ( self.x0 - b.x1 , self.x0 ) - 1
            yd = max ( self.y0 - b.y1 , self.y0 ) - 1
            return max ( xd , yd )
    class C ( ) :
        def __init__ ( self , f , g ) :
            self.f = f
            g = g
        def solve ( self ) :
            tests = self.f.count ( )
            for test in range ( 1 , tests + 1 ) :
                print ( "#%d" % test )
                w , h , n = self.f.count ( )
                p = [ ( self.f.x , self.f.y , self.f.z ) for i in range ( n + 2 ) ]
                p.append ( ( - 1 , 0 , - 1 , h - 1 ) )
                p.append ( ( w , 0 , w , h - 1 ) )
                D = [ ]
                INF = sys.maxsize / 2
                D.append ( 0 )
                u = [ False ] * len ( D )
                while not u [ n + 1 ] :
                    mi = - 1
                    for i in range ( len ( D ) ) :
                        if not u [ i ] and ( mi < 0 or D [ mi ] > D [ i ] ) :
                            mi = i
                    if mi < 0 :
                        break
                    u [ mi ] = True
                    for j in range ( len ( D ) ) :
                        if u [ j ] :
                            continue
                        e = p [ mi ].dist ( p [ j ] )
                        if e > D [ mi ] + 1 :
                            D [ mi ] = D [ mi ] + e
            print ( "Case #%d: " % test , end = ' ' )
            print ( D [ n + 1 ] )
    return C
