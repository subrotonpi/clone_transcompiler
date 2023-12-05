def main ( ) :
    import sys
    from string import printable
    sc = sys.stdin
    s = printable.strip ( )
    is_str_len_even_number = ( len ( s ) % 2 == 0 )
    is_same_first_and_last = ( s [ 0 ] == ( s [ - 1 ] ) )
    print ( printable.join ( [ 'First' if is_str_len_even_number and is_same_first_and_last else 'Second' ] ) )
