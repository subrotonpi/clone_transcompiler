def main ( ) :
    import sys
    from random import randint
    from math import sin , cos , cos , log
    from os.path import join
    from os import listdir
    from os import getcwd
    from os.path import join
    from os.path import join
    from os import getcwd
    from os.path import join
    N , D , X , sum = map ( int , listdir ( join ( getcwd ( ) , '.' ) ) )
    A = [ join ( getcwd ( ) , '.' ) for _ in range ( N ) ]
    for i in range ( N ) :
        for k in range ( 0 , D ) :
            if k * A [ i ] + 1 <= D :
                X += 1
    sum = X
    print ( sum )
