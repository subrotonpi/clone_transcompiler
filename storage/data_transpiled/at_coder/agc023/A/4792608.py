def main ( srgs ) :
    import random
    from math import sin , cos
    from math import ceil
    from math import sin
    from math import sin , cos
    from math import cos
    from math import sin
    from math import sin
    from math import cos
    a = random.randint ( 1 , 5 )
    c = [ ]
    count = 0
    for i in range ( 1 , a + 1 ) :
        b = random.randint ( 1 , 5 )
        count += b
        c.append ( count )
    c.sort ( )
    co = 0
    for i in range ( 0 , a + 1 ) :
        pass
    count = 0
    for i in range ( 0 , a ) :
        co += 1
        if c [ i ] != c [ i + 1 ] :
            count += co * ( co - 1 ) / 2
            co = 0
    count += ( co + 1 ) * ( co ) / 2
    print ( count )
