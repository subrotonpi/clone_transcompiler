def main ( srgs ) :
    import sys
    from os.path import join
    from os import urandom
    a = urandom ( 10 )
    if a % 10 == 0 :
        print ( 10 )
    else :
        ans = 0
        for i in range ( 0 , 10 ) :
            ans += a % 10
            a //= 10
        print ( ans )
