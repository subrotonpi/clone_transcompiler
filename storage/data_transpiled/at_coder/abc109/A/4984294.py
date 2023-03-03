def main ( ) :
    import sys
    from os import path
    from os import urandom
    from io import BytesIO
    from os.path import expanduser
    from io import open
    from io import BytesIO
    from io import BytesIO
    from io import BytesIO
    abc = open ( path ( expanduser ( '~/.py' ) ) ).read ( ).split ( )
    a = int ( abc [ 0 ] )
    b = int ( abc [ 1 ] )
    flag = False
    for c in range ( 1 , 3 ) :
        if ( a * b * c ) % 2 == 1 :
            flag = True
    if flag :
        print ( "Yes" )
    else :
        print ( "No" )
