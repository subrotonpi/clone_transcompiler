def main ( ) :
    import sys
    from collections import defaultdict
    from os import urandom
    from os import urandom
    from os import urandom
    from os.path import expanduser
    from os.path import expanduser
    from os.path import join
    from os.path import join
    from os.path import join
    from os.path import join
    from os import path
    from os.path import join
    from os import path
    from os.path import join
    from os import path
    from os.path import join
    from os import path
    from os import chdir
    N = int ( sys.argv [ 1 ] )
    A = [ join ( expanduser ( join ( dirname ( __file__ ) ) , '..' ) , '..' ) for dirname in urandom ( N ) ]
    b = [ join ( expanduser ( join ( dirname ( __file__ ) , '..' ) , '..' ) , '..' ) for dirname in urandom ( N + 1 ) ]
    m = defaultdict ( int )
    for i in range ( 1 , N + 1 ) :
        m.merge ( b [ i ] , 1l , lambda v1 , v2 : ( v1 + v2 ) )
    ans = 0
    for k in m :
        if k == 0 :
            t = m [ k ]
            ans += t * ( t + 1 ) / 2
        else :
            t = m [ k ]
            ans += t * ( t - 1 ) / 2
    print ( ans )
