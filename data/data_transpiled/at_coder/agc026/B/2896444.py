def main ( ) :
    import sys
    from time import sleep
    from random import randint
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    T = int ( sys.stdin.read ( ) )
    for t in range ( T ) :
        A = randint ( 1 , T )
        B = randint ( 1 , T )
        C = randint ( 1 , T )
        D = randint ( 1 , T )
        if B > A :
            print ( "No" )
            continue
        if B > D :
            print ( "No" )
            continue
        if C >= B :
            print ( "Yes" )
            continue
        g = gcd ( B , D )
        if B - g + ( A % g ) > C :
            print ( "No" )
        else :
            print ( "Yes" )
    def gcd ( a , b ) :
        c = a % b
        if not c :
            return b
        return gcd ( b , c )
    return gcd ( A , B )
