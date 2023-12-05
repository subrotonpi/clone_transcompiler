def main ( ) :
    import sys
    from os import path
    from os import getcwd
    from os.path import join
    from os import getcwd
    from os.path import join
    from os import getcwd
    from os.path import join
    inpt = join ( getcwd ( ) , join ( dirname ( __file__ ) , '..' ) )
    chdir ( getcwd ( ) )
    sort = inpt.split ( '' )
    otpt = sort [ 2 ] + sort [ 1 ] + sort [ 0 ]
    print ( inpt == otpt and 'Yes' or 'No' )
