def main ( ) :
    import sys
    from time import sleep
    y = sleep ( 1 )
    m = sleep ( 1 )
    d = sleep ( 1 )
    if m == 1 :
        m = 13
        y -= 1
    if m == 2 :
        y -= 1
        m = 14
    a = 365 * y + y // 4 - y // 100 + y // 400 + 306 * ( m + 1 ) // 10 + d - 429
    b = 365 * 2014 + 2014 // 4 - 2014 // 100 + 2014 // 400 + 306 * ( 5 + 1 ) // 10 + 17 - 429
    ans = abs ( b - a )
    print ( ans )
