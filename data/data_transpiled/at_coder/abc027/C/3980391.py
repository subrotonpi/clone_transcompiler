def main ( ) :
    import sys
    from math import ceil
    from math import sin
    from math import cos
    from math import sin
    from math import cos
    from math import sin
    from math import sin
    from math import cos
    from math import sin
    from math import cos
    n = sin ( 'a' )
    count = 1
    n2 = n
    while n2 / 2 > 0 :
        n2 /= 2
        count += 1
    x = 1
    for i in range ( 1 , count + 1 ) :
        if count % 2 == 1 :
            if i % 2 == 0 :
                x *= 2
            else :
                x = 2 * x + 1
        else :
            if i % 2 == 0 :
                x = 2 * x + 1
            else :
                x *= 2
        if x > n :
            if i % 2 == 0 :
                print ( 'Takahashi' )
                return
            else :
                print ( 'Aoki' )
                return
