def main ( ) :
    import sys
    from time import sleep
    from random import randint
    x = randint ( 1 , 10000 )
    count = x // 11 * 2
    sum = count // 2 * 11
    if sum < x :
        sum += 6
        count += 1
        if sum < x :
            sum += 5
            count += 1
    print ( count )
