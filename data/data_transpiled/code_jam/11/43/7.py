def _import ( ) :
    from os import system , get_filesystem_encoding
    from os.path import expanduser
    from os.path import join
    from os import sep
    from os.path import expanduser
    from os.path import join
    from os import sep
    from os import chdir
    from os import chdir
    from random import randint
    from random import choice
    from os import chdir
    from os import getcwd
    from os.path import join
    from os import chdir
    from os import getcwd
    from os.path import join
    from os import chdir
    from os import getcwd
    from os import chdir
    from os import getcwd
    from os import chdir
    from os import getcwd
    from os import chdir
    from os import getcwd
    from os import chdir
    from os import getcwd
    from os import chdir
    from os import getcwd
    from os import chdir
    from os import getcwd
    from os import chdir
    from os import getcwd
    from os import chdir
    from os import getcwd
    from os import chdir
    from os import getcwd
    from os import chdir
    from os import getcwd
    from os import getcwd
    from os import chdir
    from os import getcwd
    from os import chdir
    from os import getcwd
    from os import chdir
    from os import getcwd
    from os.path import join
    from os.chdir
    from os import getcwd
    from os import getcwd
    from os import chdir
    from os.path import join
    from os.chdir
    from os import getcwd
    from os.path import join
    from os.chdir
    if sys.platform == 'win32' :
        cwd = join ( dirname ( abspath ( join ( dirname ( __file__ ) ) ) ) , '..' )
    else :
        cwd = getcwd ( )
    if chdir :
        chdir ( cwd )
    else :
        import random
        random.seed ( )
    if len ( sys.argv ) >= 2 :
        input_filename = sys.argv [ 1 ]
        output_filename = sys.argv [ 2 ]
    infile = open ( input_filename , 'r' )
    outfile = open ( output_filename , 'w' )
    tests = random.randint ( 1 , int ( len ( input_filename ) ) )
    infile.readline ( )
    for t in range ( 1 , tests + 1 ) :
        outfile.write ( 'Case #%d: ' % t )
        eval ( t )
        print ( ' Case SPACETOKEN #%d: solved