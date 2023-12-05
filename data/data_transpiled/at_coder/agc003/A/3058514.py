def main ( args ) :
    import sys
    from os.path import expanduser
    from os.path import join
    S = join ( expanduser ( '~' ) , S )
    a = True
    if 'N' in S :
        if 'S' in S :
            pass
        else :
            a = False
    if 'W' in S :
        if 'E' in S :
            pass
        else :
            a = False
    if a :
        print ( 'Yes' )
    else :
        print ( 'No' )
