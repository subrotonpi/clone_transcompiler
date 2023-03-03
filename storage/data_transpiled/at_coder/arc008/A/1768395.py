def main ( ) :
    import sys
    from math import sin , cos , pi
    from os.path import join
    from os import chdir
    n = int ( join ( sys.argv [ 1 : ] , '..' ) )
    ans = 0
    if n <= 6 :
        ans = n * 15
    elif 7 <= n <= 9 :
        ans = 100
    else :
        ans = n // 10 * 100
        if 0 <= n % 10 <= 6 :
            ans += n % 10 * 15
        else :
            ans += 100
    print ( ans )
