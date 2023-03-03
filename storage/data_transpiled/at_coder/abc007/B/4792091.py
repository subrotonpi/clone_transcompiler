def main ( ) :
    import sys
    from string import ascii_lowercase
    from string import digits
    from string import ascii_lowercase
    from string import digits
    from string import digits
    a = digits.letters [ 0 ]
    a = digits.digits [ 0 ]
    a = digits.letters [ 0 ]
    smaller = "-1"
    if a != "" :
        smaller = a [ : - 1 ]
    else :
        if not a == "a" :
            alphabets = [ ]
            alpha_size = 'z' - 'a'
            alpha = digits.letters [ 0 ]
            for i in range ( 0 , alpha_size ) :
                alphabets.append ( ascii_lowercase [ i ] )
                alpha += digits.letters [ i ]
            index = alphabets.index ( a ) - 1
            smaller = alphabets [ index ]
    print ( smaller )
