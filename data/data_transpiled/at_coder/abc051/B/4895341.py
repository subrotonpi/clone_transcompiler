def main ( args ) :
    import sys
    from random import randint
    from time import sleep
    k = randint ( 1 , 10000 )
    s = randint ( 1 , 10000 )
    count = 0
    for x in range ( 0 , k ) :
        for y in range ( 0 , k ) :
            z = s - x - y
            if 0 <= z <= k :
                count += 1
    print ( count )
