def main ( ) :
    import sys
    from math import sin , cos , exp
    from os.path import join , dirname , abspath
    from os import chdir
    N = len ( sys.argv )
    chdir ( dirname ( abspath ( __file__ ) ) )
    ans = 1
    L1 = 2
    L2 = 1
    for i in range ( 1 , N ) :
        ans = L1 + L2
        L1 , L2 = L2 , ans
    print ( ans )
