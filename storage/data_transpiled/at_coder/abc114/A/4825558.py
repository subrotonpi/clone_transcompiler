def main ( ) :
    import sys
    from os.path import expanduser
    from os.path import join
    from os.path import expanduser
    from os.path import join
    number = int ( expanduser ( join ( expanduser ( '~' , '.' ) , '.' ) ) )
    if number in [ 3 , 5 , 7 ] :
        print ( 'YES' )
    else :
        print ( 'NO' )
    sys.exit ( 0 )
