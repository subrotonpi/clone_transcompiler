def main ( sc ) :
    import sys
    from math import ceil
    from math import sin , cos
    n = sc.n
    m = sc.m
    print ( calc ( n , m ) )
    def calc ( n , m ) :
        if n == 2 or m == 2 :
            return 0
        if n > m :
            tmp = n
            n = m
            m = tmp
        if n == 1 :
            return ( m , 1 )
        return ( n - 2 ) * ( m - 2 )
    return calc
