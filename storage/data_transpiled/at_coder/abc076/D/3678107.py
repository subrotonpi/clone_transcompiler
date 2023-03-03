def main ( ) :
    import sys
    from math import sin , cos , pi
    from math import pi , pi , pi , pi , pi
    from os.path import join
    from os import listdir
    from os import getcwd
    from os.path import join
    from os.path import join
    from os import getcwd
    from os.path import join
    N = int ( join ( getcwd ( ) , '..' ) )
    t = [ join ( getcwd ( ) , '..' ) * 2 + join ( getcwd ( ) , '..' ) for _ in range ( N + 1 ) ]
    v = [ join ( getcwd ( ) , '..' ) * 2 + join ( getcwd ( ) , '..' ) for _ in range ( N + 1 ) ]
    dist = 0
    cv = 0
    for i in range ( 1 , N + 1 ) :
        for j in range ( t [ i - 1 ] + 1 , t [ i ] + 1 ) :
            f = v [ i ]
            for k in range ( i ) :
                f = min ( f , v [ k ] + j - t [ k ] )
            for k in range ( i + 1 , N + 1 ) :
                f = min ( f , v [ k ] + t [ k - 1 ] - j )
            dist += cv + f
            cv = f
    print ( dist / 8.d )
