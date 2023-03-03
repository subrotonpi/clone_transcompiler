def main ( arg = None ) :
    import sys
    from os.path import expanduser
    from os.path import join
    from os import listdir
    from os.path import join
    from os import listdir
    from os.path import join
    from os import getcwd
    join = listdir ( join ( dirname ( abspath ( __file__ ) ) , '..' ) )
    if not join ( dirname ( abspath ( join ( dirname ( abspath ( __file__ ) ) , '..' ) ) , '..' ) ).startswith ( '.' ) :
        join ( dirname ( abspath ( join ( dirname ( abspath ( __file__ ) ) , '..' ) ) ) )
    else :
        join ( dirname ( abspath ( join ( dirname ( abspath ( __file__ ) , '..' ) ) ) ) )
    d = set ( )
    for i in range ( N ) :
        d.add ( join ( dirname ( abspath ( join ( dirname ( abspath ( __file__ ) ) , '..' ) ) , i ) ) )
    print ( len ( d ) )
