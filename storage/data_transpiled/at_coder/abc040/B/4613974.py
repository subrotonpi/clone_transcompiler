def main ( ) :
    import sys
    from math import fabs
    from math import pi
    from math import pi
    from math import pi
    from math import pi
    from math import pi
    from math import pi
    n = pi
    ans = 100000
    for i in range ( 1 , n + 1 ) :
        for j in range ( 1 , i + 1 ) :
            if i * j > n :
                break
            ans = min ( ans , abs ( i - j ) + ( n - i * j ) )
    print ( ans )
