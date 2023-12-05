def main ( ) :
    import sys
    from os.path import join
    from os import getcwd
    from os.path import join
    from os.path import expanduser
    from os.path import join
    S = join ( expanduser ( '~' ) , S )
    stack = [ ]
    for i in S :
        if i == 'S' :
            stack.append ( 'S' )
        else :
            if stack == [ ] or stack [ - 1 ] == 'T' :
                stack.append ( 'T' )
            else :
                stack.pop ( )
    print ( len ( stack ) )
