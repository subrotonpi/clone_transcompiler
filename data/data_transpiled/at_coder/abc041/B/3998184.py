def main ( ) :
    import sys
    from time import sleep
    from random import randint
    a = randint ( 1 , 1000000007 )
    b = randint ( 1 , 1000000007 )
    c = randint ( 1 , 1000000007 )
    d = a * b % 1000000007
    ans = ( d * c ) % 1000000007
    print ( ans )
