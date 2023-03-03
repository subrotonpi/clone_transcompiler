def main ( ) :
    import sys
    from collections import defaultdict
    from os import getenv
    from os import path
    from os import environ
    from os import environ
    m , n , N = environ.get ( 'M' , 0 ) , environ.get ( 'N' , 0 ) , environ.get ( 'N' , 0 )
    ans , rem = 0 , 0
    while N + rem >= m :
        ans += N
        N += rem
        rem = N % m
        N = N // m * n
    print ( ans , N )
