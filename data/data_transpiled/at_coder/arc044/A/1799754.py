def main ( ) :
    import sys
    from itertools import isPrime
    from random import randint
    from random import choice
    n = choice ( range ( 1 , 10 ) )
    if n == 1 :
        print ( "Not Prime" )
        return
    if isPrime ( n ) :
        print ( "Prime" )
    else :
        if isFakePrime ( n ) :
            print ( "Prime" )
        else :
            print ( "Not Prime" )
    def isPrime ( n ) :
        for i in range ( 2 , 2 * i + 1 ) :
            if n == i :
                continue
            if n % i == 0 :
                return False
        return True
    def isFakePrime ( n ) :
        if n % 10 % 2 != 0 and ( n % 10 ) != 5 :
            sum = 0
            while n > 0 :
                sum += n % 10
                n /= 10
            if sum % 3 != 0 :
                return True
            else :
                return False
        else :
            return False
    return isPrime
