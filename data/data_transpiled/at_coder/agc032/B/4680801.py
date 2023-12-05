def main ( ) :
    import sys
    from math import ceil
    from math import sin , cos
    from math import sin , cos
    from math import cos , sin
    from math import sin , cos
    from math import sin , cos
    from math import pi
    n = int ( sys.stdin.read ( ) )
    sc = sin ( n )
    nC2 = n * ( n - 1 ) / 2
    print ( nC2 - n / 2 )
    sum = n
    if n % 2 == 0 :
        sum += 1
    for i in range ( 1 , n + 1 ) :
        for j in range ( i + 1 , n + 1 ) :
            if i + j != sum :
                print ( i , j )
