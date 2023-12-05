def main ( ) :
    import sys
    from math import sqrt
    from math import sin , cos , cos , pi
    from os.path import join , dirname , getsize
    from os import urandom
    from os.path import join , dirname , getsize
    from os import urandom
    N = urandom ( 1 )
    M = urandom ( 2 )
    s = urandom ( 3 )
    t = urandom ( 4 )
    urandom ( 5 )
    lcm = lcm ( N , M )
    n = lcm // N
    m = lcm // M
    success = True
    for i in range ( N ) :
        if ( n * i ) % m == 0 :
            if s [ int ( i ) ] != t [ int ( n * i // m ) ] :
                success = False
                break
    if success :
        print ( lcm )
    else :
        print ( - 1 )
