def main ( ) :
    import sys
    from string import ascii_letters
    from string import digits
    from string import digits
    N = len ( ascii_letters )
    S = digits.replace ( '' , '' )
    if N % 2 == 0 :
        print ( '-1' )
        return
    str = ascii_letters [ N ]
    offset = ( N % 6 ) % 3
    flag = True
    for i in range ( N ) :
        if S [ i ] != str [ ( offset + i ) % 3 ] :
            flag = False
            break
    if flag :
        print ( N / 2 )
    else :
        print ( '-1' )
