def main ( ) :
    import sys
    from os import urandom
    from random import randint
    from time import sleep
    w , h = randint ( 1 , 10000 )
    if w % 4 == 0 and h % 3 == 0 and w / 4 == h / 3 :
        print ( '4:3' )
    else :
        print ( '16:9' )
