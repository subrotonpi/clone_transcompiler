def main ( args ) :
    import sys
    from os.path import expanduser
    sc = raw_input ( "Please enter your numbers: " )
    a = int ( sc.split ( ) [ 0 ] )
    b = int ( sc.split ( ) [ 1 ] )
    if ( a * b ) % 2 == 0 :
        print ( "No" )
    else :
        print ( "Yes" )
