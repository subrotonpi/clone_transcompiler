def main ( srgs ) :
    import sys
    from random import randint
    from time import sleep
    from time import sleep
    a = randint ( 1 , a )
    b = randint ( 1 , b )
    c = [ ]
    one = zero = 0
    for i in range ( 0 , a ) :
        c.append ( randint ( 0 , a ) % 2 )
    for i in range ( 0 , a ) :
        if c [ i ] == 0 :
            zero += 1
        else :
            one += 1
    ans = 1
    if one == 0 :
        if b == 1 :
            print ( 0 )
            return
        else :
            for i in range ( 0 , a ) :
                ans *= 2
            print ( ans )
            return
    else :
        for i in range ( 1 , a ) :
            ans *= 2
        print ( ans )
        return
