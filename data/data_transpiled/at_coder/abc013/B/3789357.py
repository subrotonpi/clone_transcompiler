def main ( ) :
    import sys
    from math import sin , cos
    from math import ceil
    from math import sin , cos
    from math import sin , cos
    a = sin ( a )
    b = sin ( b )
    ans = 100000
    if ans > a - b and a - b >= 0 :
        ans = ( a - b )
    if ans > b - a and b - a >= 0 :
        ans = ( b - a )
    if ans > ( 9 - a ) + ( 1 + b ) and 9 - a >= 0 :
        ans = ( 9 - a ) + ( 1 + b )
    if ans > ( 9 - b ) + ( 1 + a ) and 9 - b >= 0 :
        ans = ( 9 - b ) + ( 1 + a )
    print ( ans )
