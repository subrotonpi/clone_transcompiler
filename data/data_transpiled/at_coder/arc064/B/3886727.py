def main ( ) :
    import sys
    from string import ascii_letters
    sc = Scanner ( )
    s = sc.next ( )
    if s [ 0 ] == s [ - 1 ] :
        guki = len ( s ) - 1
        print ( 'Second' if guki % 2 == 0 else 'First' )
    else :
        guki = len ( s )
        print ( 'Second' if guki % 2 == 0 else 'First' )
