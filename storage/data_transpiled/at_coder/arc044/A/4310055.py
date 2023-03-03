def main ( ) :
    import sys
    from random import randint
    from math import log
    from math import sin , cos , log
    from math import log
    from math import log
    from math import log
    n = randint ( 1 , 5 )
    sum = 0
    x = n
    while x > 0 :
        sum += x % 10
        x /= 10
    if ( n % 2 != 0 and n % 10 != 5 and sum % 3 != 0 and n != 1 ) or n == 3 or n == 5 or n == 2 :
        print ( "Prime" )
    else :
        print ( "Not Prime" )
