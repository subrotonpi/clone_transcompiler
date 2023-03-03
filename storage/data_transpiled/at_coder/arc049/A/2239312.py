def main ( ) :
    import sys
    import string
    s = string.split ( ':' )
    arr = [ ]
    for i in range ( len ( s ) * 2 + 1 ) :
        arr.append ( ':' )
        if i % 2 == 1 :
            arr.append ( s [ i // 2 ] )
    for i in range ( 4 ) :
        p = s.find ( '\\' )
        if p == 0 :
            arr.append ( '\"' )
        else :
            arr [ 2 * p ] = '\"'
    for c in arr :
        if c == ':' :
            continue
        sys.stdout.write ( c )
    sys.stdout.write ( '\n' )
