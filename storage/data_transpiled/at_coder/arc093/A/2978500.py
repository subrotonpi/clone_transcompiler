def main ( ) :
    import sys
    from math import fabs
    from math import log
    from math import log
    from math import sin , cos
    n = int ( sys.stdin.read ( ) )
    a = [ ]
    for i in range ( 1 , n + 1 ) :
        a.append ( int ( sys.stdin.read ( ) ) )
    money = 0
    for i in range ( 1 , n + 1 ) :
        money += abs ( a [ i ] - a [ i - 1 ] )
    for i in range ( 1 , n + 1 ) :
        print ( money - abs ( a [ i ] - a [ i - 1 ] ) - abs ( a [ i + 1 ] - a [ i ] ) + abs ( a [ i + 1 ] - a [ i - 1 ] ) )
