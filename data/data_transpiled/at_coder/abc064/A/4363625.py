def main ( ) :
    import sys
    from random import randint
    from time import sleep
    from itertools import chain
    a = randint ( 1 , 10000 )
    b = randint ( 1 , 10000 )
    c = randint ( 1 , 10000 )
    sum = 100 * a + 10 * b + c
    ans = ( sum % 4 == 0 ) and 'YES' or 'NO'
    print ( ans )
