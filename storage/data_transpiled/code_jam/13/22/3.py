def _import ( ) :
    from os import system , glob , pipes
    from os.path import join
    from os import sep , rename , pipes
    from os.path import join
    from os.path import join
    from os import sep , dirname , join
    from os.path import join
    from os import sep , dirname , join , abspath , join
    from os.path import join
    from os import sep , dirname , join , abspath , join
    from os import rename
    from os import getcwd , chdir
    from os.path import join , dirname , join
    from os import getcwd , chdir
    from os.path import join , dirname , join , abspath , join
    from os import getcwd , chdir
    from os import getcwd , chdir
    n = join ( dirname ( abspath ( join ( dirname ( abspath ( join ( dirname ( __file__ ) ) ) ) ) ) ) , dirname ( join ( dirname ( abspath ( join ( dirname ( abspath ( join ( dirname ( __file__ ) ) ) ) ) ) ) ) ) )
    x = abs ( join ( dirname ( abspath ( join ( dirname ( abspath ( join ( dirname ( abspath ( join ( dirname ( __file__ ) ) ) ) ) ) ) ) ) ) ) )
    y = join ( dirname ( dirname ( abspath ( join ( dirname ( abspath ( join ( dirname ( abspath ( join ( dirname ( __file__ ) ) ) ) ) ) ) ) ) ) ) )
    m = 1
    while m * ( m + 1 ) // 2 < n :
        m += 2
    d = ( x + y ) // 2
    if d < m // 2 :
        print ( 1.0 , file = sys.stderr )
        return
    if d > m // 2 :
        print ( 0.0 , file = sys.stderr )
        return
    n -= ( m - 2 ) * ( m - 1 ) // 2
    if n == 2 * m - 1 :
        print ( 1.0 , file = sys.stderr )
        return
    if y == m - 1 :
        print ( 0.0 , file = sys.stderr )
        return
    p = [ [ 1 ] ] * ( n + 1 )
    for i in range ( n ) :
        for j in range ( m ) :
            k = i - j
            if j == m - 1 :
                p [ i + 1 ] += p [ i ] [ j ]
                continue
            if k == 0 :
            INDENT