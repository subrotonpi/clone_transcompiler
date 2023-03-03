def main ( ) :
    import sys
    import random
    import time
    import random
    from math import ceil
    from math import sin
    from math import sin
    from math import cos
    from math import sin
    from math import sin
    from math import cos
    from math import sin
    from math import sin
    from math import cos
    N , K = random.randint ( 1 , 1000000000 )
    h = [ sin ( i ) for i in range ( N ) ]
    h.sort ( )
    for i in range ( 0 , N - K ) :
        if min > h [ i + K - 1 ] - h [ i ] :
            min = h [ i + K - 1 ] - h [ i ]
    print ( min )
