def main ( ) :
    import sys
    from random import randint
    from math import radians
    from math import sin , cos , cos , log
    def f ( n ) :
        return [ sin ( n ) for i in range ( n ) ]
    m = f ( )
    x = f ( )
    goal_0 = 0
    goal_n = 0
    a = [ ]
    for i in range ( m ) :
        a.append ( f ( ) )
        if a [ i ] < x :
            goal_0 += 1
        if a [ i ] > x :
            goal_n += 1
    print ( min ( goal_0 , goal_n ) )
