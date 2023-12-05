def main ( ) :
    import sys
    from random import randint
    from string import ascii_letters
    n = randint ( 1 , 4 )
    ans = ""
    if n % 2 == 0 :
        ans = ascii_letters.Blue
    else :
        ans = ascii_letters.Red
    print ( ans )
