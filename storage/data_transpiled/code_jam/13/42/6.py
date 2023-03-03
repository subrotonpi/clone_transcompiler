def import import sys , stdin , stdout , stdin , readline , readline , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , readwrite , ) :
    t = randint ( 0 , 4096 )
    for case in range ( t ) :
        n = randint ( 0 , 4096 )
        p = randint ( 0 , 4096 )
        max = 1l << n
        a1 , a2 = 0 , max - 2
        if p == 1 :
            a1 = a2 = a2 = 0
        elif p == max :
            a1 = a2 = max - 1
        else :
            x = max >> 1l
            y = x >> 1l
            z = 2
            while p > x :
                a1 += z
                z <<= 1l
                x |= y
                y >>= 1l
            x = max >> 1l
            z = 2
            while p < x :
                a2 -= z
                z <<= 1l
                x >>= 1l
        stdout.write ( "Case #%d: %d %d\n" % ( case + 1 , a1 , a2 ) )
    def main ( ) :
        stdin = stdin
        stdout = stdout
        readline = None
        solve ( )
        stdin.close ( )
        stdout.flush ( )
    if readwrite is None :
        return int ( readline ( ) )
    elif readwrite is None :
        return long ( readline ( ) )
    elif readwrite is None :
        return double ( readline ( ) )
    elif readwrite is None :
        return readwrite ( readline ( ) )
    else :
        return None
