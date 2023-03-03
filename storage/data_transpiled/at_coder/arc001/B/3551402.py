def main ( ) :
    import sys
    from math import sin , cos , abs , abs
    from math import pi , pi , pi , pi , pi
    from os.path import join , dirname , join
    from os import path
    from os import mkdir , join , dirname , join
    from os import path
    A = join ( dirname ( abspath ( __file__ ) ) , 'A' )
    B = join ( dirname ( abspath ( __file__ ) ) , 'B' )
    a = 0
    b = 0
    a = min ( A , B )
    b = max ( A , B )
    b = b - a
    cnt = 0
    while b != 0 :
        if abs ( b - 10 ) <= 2 or b - 10 >= 0 :
            b = abs ( b - 10 )
            cnt += 1
            continue
        elif abs ( b - 5 ) <= 2 or b - 5 >= 0 :
            b = abs ( b - 5 )
            cnt += 1
            continue
        else :
            b = abs ( b - 1 )
            cnt += 1
            continue
    print ( cnt )
