def main ( ) :
    import sys
    from random import randint
    from time import sleep
    N = randint ( 1 , 10000 )
    a = [ ]
    cnt = 0
    for i in range ( N ) :
        a.append ( randint ( 1 , 10000 ) )
        while a [ i ] % 2 == 0 :
            cnt += 1
            a [ i ] /= 2
    print ( cnt )
