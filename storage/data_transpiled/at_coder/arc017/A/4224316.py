def __main ( ) :
    from os import urandom
    from random import randint
    from time import sleep
    from itertools import chain
    n = int ( urandom ( 1 ) )
    if isPrime ( n ) :
        print ( 'YES' )
    else :
        print ( 'NO' )
    def isPrime ( x ) :
        for i in range ( 2 , 1000 , x + 1 ) :
            if x % i == 0 :
                return False
        return True
    return chain ( isPrime , isPrime )
