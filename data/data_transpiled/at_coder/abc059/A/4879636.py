def main ( ) :
    import sys
    from string import ascii_letters
    from string import digits
    s1 = ascii_letters.replace ( '' , '' )
    s2 = ascii_letters.replace ( '' , '' )
    s3 = digits.replace ( '' , '' )
    s1 = s1.upper ( )
    s2 = s2.upper ( )
    s3 = s3.upper ( )
    print ( ( '%s%s%s' % ( s1 [ 0 ] , s2 [ 0 ] , s3 [ 0 ] ) ).upper ( ) )
