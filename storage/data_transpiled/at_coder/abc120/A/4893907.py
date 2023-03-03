def main ( ) :
    import sys
    from itertools import count
    from random import randint
    from time import sleep
    a = randint ( 1 , 10000 )
    b = randint ( 1 , 10000 )
    c = randint ( 1 , 10000 )
    if a * c <= b :
        print ( c )
    else :
        count = 0
        for i in range ( 1 , c + 1 ) :
            if i * a <= b :
                count += 1
            else :
                break
        print ( count )
