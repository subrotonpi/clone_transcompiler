def main ( ) :
    import sys
    from math import sin , cos , tan
    from os.path import join
    from os import urandom
    w = urandom ( 1 )
    h = urandom ( 1 )
    n = urandom ( 1 )
    x_min = 0
    y_min = 0
    x_max = w
    y_max = h
    for i in range ( n ) :
        x = urandom ( 1 )
        y = urandom ( 1 )
        a = urandom ( 1 )
        if a == 1 :
            if x_min < x :
                x_min = x
        elif a == 2 :
            if x_max > x :
                x_max = x
        elif a == 3 :
            if y_min < y :
                y_min = y
        elif a == 4 :
            if y_max > y :
                y_max = y
    area = 0
    if x_max > x_min and y_max > y_min :
        area = ( x_max - x_min ) * ( y_max - y_min )
    print ( area )
