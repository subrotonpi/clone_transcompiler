def main ( ) :
    import sys
    from math import degrees
    from math import sin , cos
    from math import cos
    a , b = sin ( a ) , cos ( b )
    if a > 12 :
        a = a - 12
    _min = a * 30 + b * 0.5
    if _min > 360 :
        _min = _min - 360
    hou = b * 6
    ans = 0
    if _min <= hou :
        ans = hou - _min
    else :
        ans = _min - hou
    if ans > 180 :
        ans = 360 - ans
    print ( ans )
