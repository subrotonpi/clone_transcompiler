def main ( ) :
    import sys
    from random import randint
    from time import sleep
    from sys import stdout
    from time import sleep
    n = randint ( 1 , 10000 )
    k = randint ( 1 , 10000 )
    point = 1
    if k <= point and n >= point :
        print ( "YES" )
        return
    n -= 1
    if k <= point and n >= point :
        print ( "YES" )
        return
    while n > 0 :
        n -= 1
        point += 1
        if k <= point and n >= point :
            print ( "YES" )
            return
    print ( "NO" )
