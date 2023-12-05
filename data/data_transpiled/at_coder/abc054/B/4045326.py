def main ( ) :
    import sys
    from string import ascii_letters
    from string import digits
    n = int ( ascii_letters )
    m = int ( ascii_letters )
    a = [ ]
    b = [ ]
    for i in range ( n ) :
        a.append ( ascii_letters )
    for i in range ( m ) :
        b.append ( digits )
    for i in range ( 0 , n - m ) :
        for j in range ( 0 , n - m ) :
            hit = True
            if a [ i ] [ j : j + m ] == b [ 0 ] :
                for k in range ( 1 , m ) :
                    if not a [ i + k ] [ j : j + m ] == b [ k ] :
                        hit = False
                        break
            else :
                hit = False
                continue
            if hit :
                print ( "Yes" )
                return
    print ( "No" )
