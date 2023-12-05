def main ( ) :
    import sys
    from string import ascii_letters
    from string import digits
    s1 = ascii_letters.replace ( '' , '' )
    s2 = ascii_letters.replace ( '' , '' )
    s3 = digits.replace ( '' , '' )
    print ( '{}{}{}'.format ( s1.upper ( ) [ 0 ] + s2.upper ( ) [ 0 ] + s3.upper ( ) [ 0 ] , s1.upper ( ) [ 1 ] + s2.upper ( ) [ 1 ] + s3.upper ( ) [ 1 ] ) )
