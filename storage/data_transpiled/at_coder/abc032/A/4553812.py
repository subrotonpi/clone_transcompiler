def main ( ) :
    import sys
    from itertools import repeat
    from random import randint
    a , b , n = map ( int , repeat ( a , b ) )
    while n % a or n % b :
        n += 1
    print ( n )
