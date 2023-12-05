def Elf ( x , y ) :
    if x == 0 or y == 0 :
        return x + y
    return gcd ( y , x % y )
t = stdin_int ( )
def gcd ( x , y ) :
    for i in range ( t ) :
        toks = stdin_int ( ).split ( "/" )
        p = int ( toks [ 0 ] )
        q = int ( toks [ 1 ] )
        print ( "Case #%d: " % ( i + 1 ) , end = "" )
        g = gcd ( p , q )
        p /= g
        q /= g
        if sum ( q ) != 1 :
            print ( "impossible" )
            continue
        result = 0
        while p < q :
            result += 1
            p *= 2
        print ( result )
