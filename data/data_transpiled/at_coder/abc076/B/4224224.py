def main ( srgs ) :
    import sys
    from os.path import join
    from os import urandom
    a = urandom ( 1024 )
    b = urandom ( 1024 )
    ans = 1
    for i in range ( 0 , a ) :
        if ans < b :
            ans *= 2
        else :
            ans += b
    print ( ans )
    os.chdir ( join ( srgs ) )
