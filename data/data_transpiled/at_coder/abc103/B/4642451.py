def main ( ) :
    import sys
    from os.path import join
    from os import sep
    from os.path import join
    from os.path import expanduser
    from os.path import join
    from os.path import join
    from os.path import join
    from os.path import join
    from os.path import join
    from os import sep
    from os.path import join
    A = join ( join ( sep , A ) , ' ' )
    B = join ( sep , B )
    lengths = len ( A )
    Bb = [ False for i in range ( lengths ) ]
    k = 0
    for i in range ( lengths ) :
        if i == 0 :
            for j in range ( 0 ) :
                if j == lengths :
                    print ( 'No' )
                    sys.exit ( )
                if not Bb [ j ] and join ( sep , A [ i : i + 1 ] ) == join ( sep , B [ j : j + 1 ] ) :
                    Bb [ j ] = True
                    k = j
                    break
        else :
            l = k + i - lengths if k + i >= lengths else k + i
            if not join ( sep , A [ i : i + 1 ] ) == join ( sep , B [ l : l + 1 ] ) :
                i = - 1
    print ( 'Yes' )
