def main ( ) :
    import math
    mp.dps = 25
    with open ( '/dev/urandom' , 'r' ) as infile :
        n , a , x = infile.read ( ).split ( )
        L = mpf ( 1 )
        ans = mpf ( 2 * x )
        for i in range ( 2 , n + 1 ) :
            t = mpf ( i )
            L = L + mpf ( 1 ) / mpf ( i )
            t = L + mpf ( i )
            t = t * mpf ( x )
            t2 = ans * mpf ( 2 ) / mpf ( i )
            ans = ans + t + t2
        L = L + mpf ( 1 ) / mpf ( n + 1 )
        L = L - mpf ( 1 )
        L = L * mpf ( n + 1 ) * mpf ( 2 * a - 3 * x )
        L = L / mpf ( 2 )
        ans = ans + L
        sys.stdout.write ( ans )
