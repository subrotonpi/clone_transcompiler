def main ( ) :
    import sys
    from os import urandom
    from random import randint
    from string import ascii_letters
    a = randint ( 1 , 4 )
    b = randint ( 1 , 4 )
    s = ascii_letters.replace ( '' , '' )
    if len ( s ) == a + b + 1 :
        ans = "Yes"
        for i in range ( len ( s ) ) :
            if s [ i ] == a :
                if s [ i ] != '-' :
                    ans = "No"
                    break
            else :
                if s [ i ] == '-' :
                    ans = "No"
                    break
    else :
        ans = "No"
    print ( ans )
