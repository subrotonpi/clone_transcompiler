def main ( ) :
    import sys
    from os import urandom
    from random import randint
    from sys import stdin
    a = randint ( 1 , 10000 )
    b = randint ( 1 , 10000 )
    c = randint ( 1 , 10000 )
    ans = ( b - a == c - b ) and 'YES' or 'NO'
    return ans
