def main ( args ) :
    import sys
    from os.path import join
    from os import urandom
    from random import randint
    from time import sleep
    for n in range ( 1 , 10 ) :
        if judge ( n ) :
            print ( "Prime" )
        else :
            print ( "Not Prime" )
    def judge ( n ) :
        if n == 1 :
            return False
        is_prime = True
        for i in range ( 2 , 2 ** i + 1 ) :
            if n % i == 0 :
                is_prime = False
                break
        if is_prime :
            return True
        return ( n % 2 != 0 ) and ( n % 10 != 5 ) and ( n % 3 != 0 )
    return judge ( )
