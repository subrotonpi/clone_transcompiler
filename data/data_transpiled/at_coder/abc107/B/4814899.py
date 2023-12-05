def main ( ) :
    import sys
    import string
    import sys
    import string
    import sys
    h , w = int ( sys.stdin.read ( ) ) , int ( sys.stdin.read ( ) )
    st = string.split ( ' ' )
    c = [ ]
    tate = [ False ]
    yoko = [ False ]
    tate = [ False ]
    yoko = [ False ]
    for i in range ( 1 , h + 1 ) :
        st.append ( sc.readline ( ) )
        for j in range ( 1 , w + 1 ) :
            c [ i ] [ j ] = st [ i ] [ j - 1 ]
            if c [ i ] [ j ] == '#' :
                tate.append ( True )
                yoko.append ( True )
    for i in range ( 1 , h + 1 ) :
        for j in range ( 1 , w + 1 ) :
            if tate [ i ] and yoko [ j ] :
                sys.stdout.write ( c [ i ] [ j ] )
        sys.stdout.write ( '\n' )
