def gcj ( ) :
    import os
    from glob import glob
    from os.path import join
    from os import rename
    from os import getcwd
    from os.path import join
    from os.path import join
    from os import sep
    from os.path import join
    from os import sep
    from os.path import join
    from os import sep
    from os import chdir
    f = open ( join ( dirname ( __file__ ) , 'A-large.in' ) , 'r' )
    f = open ( join ( dirname ( __file__ ) , 'R1_Q1.out' ) , 'w' )
    f.write ( '\n' )
    f.close ( )
    f = open ( join ( dirname ( __file__ ) , 'R1_Q1.out' ) , 'w' )
    f.write ( '\n' )
    f.close ( )
    L , D , N = map ( int , f.readlines ( ) )
    L = int ( L )
    D = int ( D )
    N = int ( N )
    set = [ join ( dirname ( __file__ ) , 'R1_Q1.out' ) for dirname ( __file__ ) in dir ( d ) ]
    for n_case in range ( 1 , N + 1 ) :
        o_p = f.read ( )
        p = o_p.replace ( '(' , '[' )
        p = p.replace ( ')' , ']' )
        result = 0
        for i in range ( D ) :
            if re.match ( p , set [ i ] ) :
                result += 1
        print ( 'Case #%d: %d' % ( n_case , result ) , file = f )
    f.close ( )
