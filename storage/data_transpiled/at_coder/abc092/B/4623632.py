def main ( ) :
    import sys
    from random import randint
    reader = open ( "/proc/stations" , "r" )
    N = randint ( 1 , N )
    D = randint ( 1 , D )
    X = randint ( 1 , X )
    ans = X
    for i in range ( 1 , N + 1 ) :
        num = randint ( 1 , D )
        ans += ( D - 1 ) / num + 1
    sys.stdout.write ( ans )
