def main ( ) :
    import sys
    from time import sleep
    from random import randint
    x = randint ( 1 , 10000 )
    sum = 0
    n = x
    while n > 0 :
        sum += n % 10
        n /= 10
    result = ( x % sum == 0 ) and 'Yes' or 'No'
    print ( result )
