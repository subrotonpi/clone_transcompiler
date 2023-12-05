def main ( ) :
    import sys
    from os import path
    from os import environ
    sc = environ.get ( 'wsgi.input' )
    data = sc.read ( )
    if data [ 0 ] == data [ 1 ] and data [ 1 ] == data [ 2 ] :
        print ( 'Yes' )
    elif data [ 1 ] == data [ 2 ] and data [ 2 ] == data [ 3 ] :
        print ( 'Yes' )
    else :
        print ( 'No' )
