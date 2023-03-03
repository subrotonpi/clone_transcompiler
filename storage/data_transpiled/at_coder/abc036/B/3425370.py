def main ( args ) :
    import time
    from sys import stdin
    from os import urandom
    n = int ( stdin.readline ( ) )
    a = [ ]
    s = [ ]
    for i in range ( n ) :
        a.append ( stdin.readline ( ) )
        for j in range ( n ) :
            s [ ( n - 1 ) - i ].append ( a [ i ] [ j ] )
    for i in range ( n ) :
        for j in range ( n ) :
            print ( s [ j ] [ i ] , end = ' ' )
        print ( '\n' , end = ' ' )
    stdin.close ( )
    def gcd ( a , b ) :
        if a < b :
            tmp = a
            a = b
            b = tmp
        r = - 1
        while r != 0 :
            r = a % b
            a = b
            b = r
        return a
    return gcd
