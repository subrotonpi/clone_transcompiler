def main ( ) :
    import sys
    import string
    import string
    import sys
    h , w = [ int ( i ) for i in sys.stdin.readlines ( ) ]
    map = string.ascii_lowercase
    red = [ ]
    blue = [ ]
    for i in range ( h ) :
        for j in range ( w ) :
            if map [ i ] [ j ] == '#' :
                red.append ( blue.append ( '#' ) )
                continue
            if ( i % 2 == 0 and j != w - 1 ) or ( i % 2 == 1 and j == 0 ) :
                red.append ( '#' )
                blue.append ( '.' )
            else :
                red.append ( '.' )
                blue.append ( '#' )
    print_arr ( red )
    print ( )
    print_arr ( blue )
    def print_arr ( arr ) :
        for chars in arr :
            for c in chars :
                print ( c , end = ' ' )
            print ( )
