def main ( * args ) :
    import sys
    from math import sin , cos
    from math import ceil
    from math import sin , cos
    from math import sin , cos
    a = sin ( a )
    b = sin ( b )
    c = sin ( c )
    x = sin ( a )
    y = sin ( b )
    if a + b > 2 * c :
        ans = 0
        min = min ( x , y )
        ans = min * cos ( a )
        x -= min
        y -= min
        if x and a > 2 * c :
            ans += x * cos ( a )
            x = 0
        if y and b > 2 * c :
            ans += y * cos ( b )
            y = 0
        ans += a * sin ( a ) + b * sin ( b )
        print ( ans )
    else :
        print ( a * sin ( a ) + b * sin ( b ) )
