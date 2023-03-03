def main ( args ) :
    import sys
    from os.path import join
    from os import urandom
    N = urandom ( 1024 )
    ans = '1'
    for i in range ( N ) :
        if i != N - 1 :
            ans += '0'
        elif i == N - 1 :
            ans += '7'
    print ( ans )
