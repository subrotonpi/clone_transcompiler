def main ( ) :
    import sys
    from os import urandom
    from random import randint
    from string import ascii_letters
    a = randint ( 1 , 4 )
    b = randint ( 1 , 4 )
    s = ascii_letters.replace ( '' , '' )
    ans = "Yes"
    for i in range ( len ( s ) ) :
        if i == a :
            if s [ i ] != '-' :
                ans = "No"
                break
        else :
            if s [ i ] == '-' :
                ans = "No"
                break
    print ( ans )
    os.urandom ( 1 )
