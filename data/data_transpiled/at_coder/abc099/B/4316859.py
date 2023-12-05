def main ( ) :
    import sys
    from time import sleep
    from random import randint
    from itertools import chain
    a = randint ( 1 , 10000 )
    b = randint ( 1 , 10000 )
    tall = 0
    for i in range ( 1 , b - a + 1 ) :
        tall += i
    print ( tall - b )
