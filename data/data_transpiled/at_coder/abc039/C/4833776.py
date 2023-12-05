def main ( ) :
    import sys
    from string import printable
    sc = sys.stdin
    s = sc.read ( ).split ( ' ' )
    sc.close ( )
    if s [ 4 ] == 'W' and s [ 5 ] == 'W' and s [ 11 ] == 'W' and s [ 12 ] == 'W' :
        print ( 'Do' )
    elif s [ 2 ] == 'W' and s [ 3 ] == 'W' and s [ 9 ] == 'W' and s [ 10 ] == 'W' :
        print ( 'Re' )
    elif s [ 0 ] == 'W' and s [ 1 ] == 'W' and s [ 7 ] == 'W' and s [ 8 ] == 'W' :
        print ( 'Mi' )
    elif s [ 6 ] == 'W' and s [ 7 ] == 'W' and s [ 11 ] == 'W' and s [ 12 ] == 'W' :
        print ( 'Fa' )
    elif s [ 4 ] == 'W' and s [ 5 ] == 'W' and s [ 9 ] == 'W' and s [ 10 ] == 'W' :
        print ( 'So' )
    elif s [ 2 ] == 'W' and s [ 3 ] == 'W' and s [ 7 ] == 'W' and s [ 8 ] == 'W' :
        print ( 'La' )
    elif s [ 0 ] == 'W' and s [ 1 ] == 'W' and s [ 5 ] == 'W' and s [ 6 ] == 'W' :
        print ( 'Si' )
