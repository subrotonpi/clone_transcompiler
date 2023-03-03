def main ( ) :
    import sys
    from os.path import expanduser
    from os.path import join
    from os import getenv
    N = getenv ( 'N' , 0 )
    K = getenv ( 'K' , 0 )
    sys.path.insert ( 0 , expanduser ( '~/.sympy' ) )
    ans = 1
    for i in range ( N ) :
        if ans < K :
            ans = ans * 2
        else :
            ans = ans + K
    print ( ans )
