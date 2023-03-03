def main ( ) :
    import sys
    from math import fabs
    from math import pi
    s = sys.stdin.read ( )
    t = sys.stdin.read ( )
    x = y = cnt = 0
    for char in s :
        if char == 'L' :
            x -= 1
        elif char == 'R' :
            x += 1
        elif char == 'U' :
            y += 1
        elif char == 'D' :
            y -= 1
        else :
            cnt += 1
    ans = abs ( x ) + abs ( y )
    if t == 1 :
        ans += cnt
    else :
        if ans >= cnt :
            ans -= cnt
        else :
            cnt -= ans
            if cnt % 2 == 0 :
                ans = 0
            else :
                ans = 1
    print ( ans )
