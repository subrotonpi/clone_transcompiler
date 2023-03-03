def main ( ) :
    import math
    from math import degrees
    sc = open ( '/proc/stations' , 'r' )
    st = sc.readline ( ).split ( )
    sc.close ( )
    n , m = map ( int , st )
    n = n - 12 if n >= 12 else n
    short_hand = ( n * 30 ) + ( m * 0.5 )
    long_hand = m * 6
    ans = abs ( short_hand - long_hand )
    ans = abs ( 360 - ans ) if ans > 180 else ans
    print ( round ( ans * 1000.0 ) / 1000.0 )
