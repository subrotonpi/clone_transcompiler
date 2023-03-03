def main ( ) :
    import sys
    from random import randint
    from math import sin , cos , cos , tan
    from math import cos , sin , tan
    n , h , a , b , c , d , e = map ( int , sys.stdin.read ( ).split ( ) )
    ans = cos ( n )
    for x in range ( 0 , n ) :
        y = e ** n - e ** x - h - b * x
        if y < 0 :
            y = 0
        else :
            y = y / ( sin ( d + e ) + 1 )
        if x + y <= n :
            ans = min ( ans , a * x + c * y )
    print ( ans )
