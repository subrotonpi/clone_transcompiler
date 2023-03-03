def main ( ) :
    import sys
    from itertools import repeat
    from random import randint
    a = randint ( 1 , 10000 )
    b = randint ( 1 , 10000 )
    count = 0
    for i in range ( a , b + 1 ) :
        reversed_number = u''.join ( str ( i ).reverse ( ) )
        if str ( i ) == reversed_number :
            count += 1
    print ( count )
