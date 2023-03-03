def main ( ) :
    import sys
    from string import ascii_lowercase
    from string import digits
    from string import ascii_lowercase
    from string import digits
    from string import ascii_lowercase
    from string import digits
    from string import ascii_lowercase
    from string import digits
    S = digits.letters
    T = digits.digits
    SS = S + S
    flag = False
    ans = False
    for i in range ( len ( S ) ) :
        flag = False
        for j in range ( len ( S ) ) :
            if SS [ i + j ] != T [ j ] :
                flag = True
        if not flag :
            ans = True
    if ans :
        print ( "Yes" )
    else :
        print ( "No" )
