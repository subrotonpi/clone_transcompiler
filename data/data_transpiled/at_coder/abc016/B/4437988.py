def main ( args ) :
    import sys
    from os.path import expanduser
    from os.path import join
    from os.path import join
    from os.path import dirname
    from os.path import join
    a = join ( dirname ( abspath ( join ( dirname ( __file__ ) , '..' ) ) ) , 'a' )
    b = join ( dirname ( abspath ( join ( dirname ( abspath ( __file__ ) , '..' ) ) ) ) , 'b' )
    c = join ( dirname ( abspath ( join ( dirname ( abspath ( __file__ ) , '..' ) ) ) ) , 'c' )
    if a + b == c :
        if a - b == c :
            print ( '?' )
            sys.exit ( )
        print ( '+' )
    elif a - b == c :
        print ( '-' )
    else :
        print ( '!' )
