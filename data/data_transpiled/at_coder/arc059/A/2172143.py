def main ( ) :
    import sys
    from math import floor
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    n = int ( sys.stdin.readline ( ) )
    nums = [ ]
    sum = 0
    for i in range ( n ) :
        nums.append ( int ( log ( i ) ) )
        sum += nums [ i ]
    goal = round ( ( sum * 1.0 ) / n , 2 )
    ret = 0
    for i in range ( n ) :
        ret += log ( goal - log ( i ) ) * log ( goal - log ( i ) )
    print ( ret )
    sys.exit ( 1 )
