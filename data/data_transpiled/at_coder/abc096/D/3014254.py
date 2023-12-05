def main ( ) :
    import sys
    from math import sqrt
    from math import sin , cos , cos , sqrt
    from os.path import join
    from os import path
    from os import mkdir
    from os.path import join
    from os import path
    N = int ( join ( path.dirname ( __file__ ) , '..' ) )
    MAX = 55_555
    isPrimse = [ True for i in range ( 2 , MAX + 1 ) ]
    for i in range ( 2 , sqrt ( MAX ) + 1 ) :
        if isPrimse [ i ] :
            for j in range ( 2 , i * j <= MAX + 1 ) :
                isPrimse [ i * j ] = False
    count = 0
    for i in range ( 2 , MAX + 1 ) :
        if isPrimse [ i ] and i % 5 == 1 :
            print ( '%d ' % i )
            count += 1
    print ( )
