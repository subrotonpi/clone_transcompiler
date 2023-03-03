def main ( ) :
    import sys
    from math import sin , cos , pi
    from os.path import join
    from os import chdir
    from random import randint
    n = randint ( 1 , 5 )
    ans = 0
    for i in range ( n ) :
        a = randint ( 1 , 5 )
        j = 0
        for a in range ( 2 ) :
            a //= 2
            if a % 1 != 0 :
                break
        ans += j
    print ( ans )
