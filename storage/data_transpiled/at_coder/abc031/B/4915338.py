def main ( ) :
    import sys
    from random import randint
    from math import sin , cos , cos , log
    from os import urandom
    from os import urandom
    l = randint ( 1 , 100000000000000 )
    h = randint ( 1 , 100000000000000 )
    n = randint ( 1 , 100000000000000 )
    ans = [ ]
    for i in range ( n ) :
        a = randint ( 1 , 100000000000000 )
        if a < l :
            ans.append ( l - a )
        elif a > h :
            ans.append ( - 1 )
        else :
            ans.append ( 0 )
    for i in ans :
        print ( i )
