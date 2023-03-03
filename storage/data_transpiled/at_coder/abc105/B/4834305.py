def main ( ) :
    import sys
    from os import urandom
    from random import randint
    from time import sleep
    a = randint ( 1 , 10000 )
    urandom.seed ( a )
    ans = False
    for i in range ( 100 ) :
        for j in range ( 100 ) :
            if i * 4 + j * 7 == a :
                ans = True
                break
    print ( 'Yes' if ans else 'No' )
