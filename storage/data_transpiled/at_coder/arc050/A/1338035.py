def main ( ) :
    import sys
    from os.path import join
    from os import sep
    f = open ( join ( sys.argv [ 1 : ] , '..' ) )
    params = f.read ( ).split ( )
    row = params [ 0 ].lower ( )
    if row == params [ 1 ] :
        print ( 'Yes' )
    else :
        print ( 'No' )
