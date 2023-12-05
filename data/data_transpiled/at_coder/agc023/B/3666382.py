def main ( args ) :
    import sys
    from string import ascii_letters
    from string import digits
    from string import ascii_letters
    from string import digits
    N = len ( ascii_letters )
    ansbase = 0
    S = [ ]
    s = [ ]
    for i in range ( N ) :
        S.append ( ascii_letters [ i ] )
        for j in range ( N ) :
            s [ i ] [ j ] = S [ i ] [ j ]
    for i in range ( N ) :
        OK = True
        for j in range ( N ) :
            for k in range ( N ) :
                if s [ ( i + j ) % N ] [ k ] != s [ ( i + k ) % N ] [ j ] :
                    OK = False
        if OK :
            ansbase += 1
    print ( ansbase * N )
