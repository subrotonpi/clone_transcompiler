def main ( ) :
    import sys
    from math import fabs
    from math import radians
    reader = Scanner ( )
    A = reader.next ( )
    previous = reader.next ( )
    tmp = reader.next ( )
    result = abs ( tmp - previous )
    for i in range ( 1 , A ) :
        previous = tmp
        tmp = reader.next ( )
        result = gcd ( abs ( tmp - previous ) , result )
    sys.stdout.write ( result )
    def gcd ( x , y ) :
        if y > x :
            tmp = y
            y = x
            x = tmp
        while ( x % y ) :
            x , y = y , x
        return y
    return gcd
