def main ( ) :
    import sys
    from time import sleep
    from itertools import chain
    a = int ( sys.stdin.read ( ) )
    b = int ( sys.stdin.read ( ) )
    k = int ( sys.stdin.read ( ) )
    if b - a + 1 <= 2 * k :
        for i in chain ( a , b ) :
            print ( i )
    else :
        for i , j in chain ( a , k + a ) :
            print ( i )
        for j in chain ( b - k + 1 , b ) :
            print ( j )
