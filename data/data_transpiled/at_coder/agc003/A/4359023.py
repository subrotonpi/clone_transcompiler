def main ( ) :
    import sys
    from string import ascii_letters
    sc = Scanner ( )
    arr = sc.next ( ).split ( ' ' )
    counts = [ 0 ] * 26
    for c in arr :
        counts [ c - 'A' ] += 1
    if ( ( counts [ 'N' - 'A' ] != 0 and counts [ 'S' - 'A' ] != 0 ) or ( counts [ 'N' - 'A' ] == 0 and counts [ 'S' - 'A' ] == 0 ) ) and ( ( counts [ 'E' - 'A' ] != 0 and counts [ 'W' - 'A' ] != 0 ) or ( counts [ 'E' - 'A' ] == 0 and counts [ 'W' - 'A' ] == 0 ) ) :
        print ( 'Yes' , end = ' ' )
    else :
        print ( 'No' , end = ' ' )
