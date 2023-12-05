def main ( ) :
    import sys
    from math import sin , cos , pi
    from os.path import join
    from os import chdir
    from os import urandom
    a = urandom ( 1 )
    aa = a / 1000.0
    ans = 0
    if aa < 0.1 :
        ans = 0
    elif aa >= 0.1 and aa <= 5 :
        ans = int ( aa * 10 )
    elif aa >= 6 and aa <= 30 :
        ans = int ( aa + 50 )
    elif aa >= 35 and aa <= 70 :
        ans = int ( ( aa - 30 ) / 5 + 80 )
    elif aa > 70 :
        ans = 89
    bb = '%02d' % ans
    print ( bb )
