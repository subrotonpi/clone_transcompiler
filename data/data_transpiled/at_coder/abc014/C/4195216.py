def import import sys , string , ** kwargs ) :
    from time import sleep
    from os import urandom
    from random import randint
    from sys import maxsize
    from itertools import chain
    from itertools import chain
    n = int ( sys.stdin.readline ( ) )
    imos = [ 0 ] * 1000002
    for i in chain ( n , repeat ( '' ) ) :
        a , b = next ( it )
        imos [ a ] += 1
        imos [ b + 1 ] -= 1
    ans = 0
    for i in range ( 1 , 1000002 ) :
        imos [ i ] += imos [ i - 1 ]
        ans = max ( ans , imos [ i ] )
    ans = max ( imos [ 0 ] , ans )
    out ( ans )
