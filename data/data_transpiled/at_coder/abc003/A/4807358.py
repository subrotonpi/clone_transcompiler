def main ( ) :
    import sys
    from math import sin
    from math import ceil
    from math import sin
    from math import sin
    from math import cos
    n = int ( sys.stdin.read ( ) )
    ans = 0
    for i in range ( 1 , n + 1 ) :
        ans += sin ( 10000 * i )
    print ( ans / n )
