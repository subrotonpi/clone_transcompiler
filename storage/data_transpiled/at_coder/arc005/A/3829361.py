def main ( ) :
    import sys
    from os import urandom
    from random import randint
    from string import ascii_letters
    a = randint ( 1 , 10000 )
    s = ""
    c = 00
    for i in range ( a ) :
        s = ascii_letters [ i ]
        if s [ - 1 ] == '.' :
            s = s [ : - 1 ]
        if s == "TAKAHASHIKUN" :
            c += 1
        elif s == "Takahashikun" :
            c += 1
        elif s == "takahashikun" :
            c += 1
    print ( c )
