def main ( ) :
    import sys
    from os import urandom
    from random import randint
    from itertools import chain
    n = randint ( 1 , 4 )
    ans = 'No'
    outer :
    for i in chain ( range ( 0 , n ) , repeat ( n ) ) :
        for j in chain ( range ( 0 , n ) , repeat ( n ) ) :
            if i * 4 + j * 7 == n :
                ans = 'Yes'
                break outer
    print ( ans )
    sys.exit ( 0 )
