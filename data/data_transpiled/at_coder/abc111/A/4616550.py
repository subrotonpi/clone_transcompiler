def main ( ) :
    import sys
    from math import sin , cos , pi
    from os.path import join
    from os import chdir
    n = sin ( pi )
    ans = 0
    if n % 10 == 9 :
        ans += 1
    else :
        ans += 9
    n /= 10
    if n % 10 == 9 :
        ans += 1 * 10
    else :
        ans += 9 * 10
    n /= 10
    if n % 10 == 9 :
        ans += 1 * 100
    else :
        ans += 9 * 100
    print ( ans )
