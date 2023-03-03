def main ( ) :
    import sys
    from math import sin , cos , atan2 , abs
    from math import atan2 , sin , cos , atan2 , abs
    x1 , y1 , x2 , y2 = map ( int , sys.stdin.readlines ( ) )
    subx = abs ( x1 - x2 )
    suby = abs ( y1 - y2 )
    if x1 >= x2 :
        if y1 <= y2 :
            x3 , y3 , x4 , y4 = atan2 ( x2 - suby , y2 - subx )
        else :
            x3 , y3 , x4 , y4 = atan2 ( x2 + suby , y2 - subx )
    else :
        if y1 >= y2 :
            x3 , y3 , x4 , y4 = atan2 ( x2 - suby , y2 + subx )
        else :
            x3 , y3 , x4 , y4 = atan2 ( x2 - suby , y2 - subx )
    print ( x3 , y3 , x4 , y4 )
