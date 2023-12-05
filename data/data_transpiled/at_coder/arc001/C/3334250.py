def main ( ) :
    import math
    from os import urandom
    import random
    a = random.randint ( 1 , 10 )
    b = random.randint ( 1 , 10 )
    random.shuffle ( a )
    if a > b :
        temp = a
        a = b
        b = temp
    ct = 0
    while a != b :
        c = b - a
        if c >= 10 :
            a += 10
            ct += 1
        elif c < 10 :
            d = abs ( c - 10 )
            if d <= 2 :
                a += 10
                ct += 1
            elif d > 2 :
                e = abs ( c - 5 )
                if e <= 2 :
                    a += 5
                    ct += 1
                elif c < 0 :
                    a -= 1
                    ct += 1
                elif c > 0 and c < 5 :
                    a += 1
                    ct += 1
    print ( ct )
