def _import ( ) :
    import sys
    import os
    import sys
    import termios
    import struct
    class x :
        def __init__ ( self , i ) :
            self.w , self.h = i
        def line ( self , px , py , x1 , y1 ) :
            if x1 != None :
                if x1 > 0 :
                    xval = ( self.w - px - 1 ) / x1
                else :
                    xval = self.px / ( - x1 )
            else :
                xval = int ( px )
            if y1 != None :
                if y1 > 0 :
                    yval = self.h - self.h / y1
                else :
                    yval = self.py / ( - y1 )
            else :
                yval = int ( py )
            return min ( xval , yval )
    Q = [ ]
    def put ( x , y ) :
        if x < 0 or x >= w or y < 0 or y >= h :
            return
        p = ( x , y )
        if p in q :
            return
        q.append ( p )
        Q.append ( p )
    def main ( args ) :
        with open ( '/dev/tty' , 'w' ) as f :
            tcnt = len ( args )
            for i in range ( 1 , tcnt + 1 ) :
                w , h , x1 , y1 , x2 , y2 = select.select ( [ x , y ] , [ ] , [ ] , 0 )
                px , py , ans = 0 , 0 , 0
                if x1 * y2 - x2 * y1 == 0 :
                    q = set ( )
                    Q = [ ]
                    qh = 0
                    qt = 0
                    put ( px , py )
                    while qh < qt :
                        p = Q [ qh ]
                        qh += 1
                        put ( p [ 0 ] + x1 , p [ 1 ] + y1 )
                        put ( p [ 0 ] + x2 , p [ 1 ] + y2 )
                    ans = qt
                else :
                    while True :
                        cur = line ( px , py , x1 , y1 )
                        ans += cur + 1
                        px += cur
                        py += cur
    return main
