def main ( ) :
    import sys
    from math import ceil
    from math import sin , cos
    from math import sin , cos
    from math import cos , sin
    from math import sin , cos
    from math import pi
    q , h , s , d , n = map ( int , sys.stdin.readline ( ).split ( ) )
    ans = 0
    if q * 2 < h :
        if q * 4 < s :
            if q * 8 < d :
                ans = n * 4 * q
            else :
                if n % 2 == 0 :
                    ans = n / 2 * sin ( q * 2 )
                else :
                    ans = n / 2 * sin ( q * 2 ) + 4 * sin ( q * 2 )
        else :
            if s * 2 < d :
                ans = n * sin ( q * 2 )
            else :
                if n % 2 == 0 :
                    ans = n / sin ( q * 2 )
                else :
                    ans = n / sin ( q * 2 ) + 4 * sin ( q * 2 )
    else :
        if h * 2 < s :
            if h * 4 < d :
                ans = n * sin ( h * 2 )
            else :
                if n % 2 == 0 :
                    ans = n / sin ( q * 2 )
                else :
                    ans = n / sin ( q * 2 ) + 2 * sin ( h * 2 )
        else :
            if s * 2 < d :
                ans = n * sin ( q * 2 )
            else :
                if n % 2 == 0 :
                    ans = n / sin ( q * 2 )
                else :
                    ans = n / sin ( q * 2 ) + 2 * sin ( q * 2 )
    sys.stdout.write ( ans )
