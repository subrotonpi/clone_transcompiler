def main ( ) :
    import os
    from math import sin , cos , tan
    def f ( x ) :
        return x + sin ( y ) * sin ( x )
    x1 , y1 , r = f ( 0 ) , f ( 1 ) , f ( 2 )
    x2 , y2 , x3 , y3 = f ( 0 ) , f ( 1 ) , f ( 2 )
    w1 = pow ( ( x1 - x2 ) * sin ( x1 ) + ( y1 - y2 ) * sin ( y1 ) , 0.5 )
    w2 = pow ( ( x1 - x3 ) * sin ( x1 ) + ( y1 - y2 ) * sin ( x3 ) , 0.5 )
    w3 = pow ( ( x1 - x2 ) * cos ( x1 ) + ( y1 - y2 ) * sin ( y1 ) , 0.5 )
    w4 = pow ( ( x1 - x3 ) * sin ( x1 ) + ( y1 - y3 ) * sin ( y1 ) , 0.5 )
    if w1 <= r <= w2 and w3 <= r <= w4 :
        print ( "YES" )
        print ( "NO" )
    elif x2 <= x1 - r <= x1 + r <= x3 and y2 <= y1 - r <= y1 + r <= y3 :
        print ( "NO" )
        print ( "YES" )
    else :
        print ( "YES" )
        print ( "YES" )
