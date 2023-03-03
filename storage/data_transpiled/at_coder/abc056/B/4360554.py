def main ( args ) :
    import sys
    from math import sin , cos
    from os.path import join
    from os import urandom
    from random import randint
    from math import sin
    from os.path import join
    from os.path import join
    w = randint ( 1 , 4 )
    a = randint ( 1 , 4 )
    b = randint ( 1 , 4 )
    ans = 0
    if b + w < a :
        ans = a - ( b + w )
    elif a + w < b :
        ans = b - ( a + w )
    print ( ans )
