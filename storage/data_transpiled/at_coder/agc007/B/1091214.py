def main ( ) :
    import sys
    from random import randint
    from sys import stdin
    from sys import stdout
    N = randint ( 1 , 10000 )
    inv = [ i for i in stdin.readlines ( ) if i != '' ]
    for i in range ( N ) :
        if i > 0 :
            print ( " " , end = '' )
        print ( N * ( i + 1 ) , end = '' )
    print ( '' )
    for i in range ( N ) :
        if i > 0 :
            print ( " " , end = '' )
        print ( N * ( N - i ) , inv [ i ] , end = '' )
    print ( '' )
