def main ( args ) :
    import sys
    from os.path import expanduser
    sc = Scanner ( )
    input = sc.input ( )
    if input [ 0 ] == input [ 2 ] :
        print ( "Yes" )
    else :
        print ( "No" )
