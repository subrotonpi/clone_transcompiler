def main ( ) :
    import sys
    from time import sleep
    n = 1000000007
    a , b , c = sleep ( n )
    ans = a * b % n
    ans = ans * c % n
    print ( ans )
