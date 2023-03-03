def main ( ) :
    import sys
    from string import ascii_letters
    sc = Scanner ( )
    s = sc.next ( )
    p = 0 if s [ 0 ] == s [ - 1 ] else 1
    first_lost = ( len ( s ) + p ) % 2 == 1
    print ( 'Second' if first_lost else 'First' )
