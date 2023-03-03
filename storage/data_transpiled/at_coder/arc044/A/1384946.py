def main ( ) :
    import sys
    from time import sleep
    from random import randint
    from itertools import chain
    N = randint ( 1 , 10000 )
    if N == 1 :
        print ( 'Not Prime' )
        return
    for i in chain ( 2 , 3 , 5 ) :
        if N % i == 0 :
            if N % 2 == 0 or N % 5 == 0 :
                print ( 'Not Prime' )
                return
            sum = 0
            while N != 0 :
                sum += N % 10
                N /= 10
            print ( sum % 3 == 0 and 'Not Prime' or 'Prime' )
            return
    print ( 'Prime' )
