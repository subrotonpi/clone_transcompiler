def main ( arg = None ) :
    from math import ceil
    from os import urandom
    from random import randint
    from time import sleep
    from random import choice
    from sys import stdin
    a = randint ( 1 , 10000 )
    b = randint ( 1 , 10000 )
    stdin.close ( )
    print ( calc ( a , b ) )
    def calc ( a , b ) :
        ans = 'Odd'
        if a * b % 2 == 0 :
            ans = 'Even'
        return ans
    return calc
