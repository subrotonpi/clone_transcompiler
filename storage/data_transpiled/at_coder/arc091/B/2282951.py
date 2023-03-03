def main ( ) :
    import sys
    from time import sleep
    from random import randint
    from sys import stdin
    n = randint ( 1 , 10000 )
    k = randint ( 1 , 10000 )
    if k == 0 :
        sys.stdout.write ( long ( n * n ) )
        return
    sum = 0
    for i in range ( k + 1 , n + 1 ) :
        sum += int ( n / i ) * ( i - k ) + max ( n % i - k + 1 , 0 )
    sys.stdout.write ( sum )
