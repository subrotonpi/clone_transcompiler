def main ( ) :
    import sys
    from random import randint
    from time import sleep
    from math import sqrt
    from math import log
    from math import log
    from math import log
    T = randint ( 1 , 5 )
    for A , B , C , D in map ( int , range ( T ) ) :
        if solve ( A , B , C , D ) :
            print ( "Yes" )
        else :
            print ( "No" )
    def solve ( A , B , C , D ) :
        if A < B :
            return False
        if D < B :
            return False
        if C > B :
            return True
        gcd = gcd ( B , D )
        max = ( ( B - 1 - ( A % B ) ) / gcd ) * gcd + ( A % B )
        return max <= C
    def gcd ( i , j ) :
        if i > j :
            return gcd ( j , i )
        if i == 0 :
            return j
        r = j % i
        return gcd ( r , i )
    return solve ( )
