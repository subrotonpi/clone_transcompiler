def main ( ) :
    import sys
    from string import ascii_letters
    from string import digits
    a_str = ascii_letters.join ( digits )
    b_str = digits.join ( digits )
    a = a_str.lower ( )
    b = b_str.lower ( )
    if a == 'H' :
        ans = ( b == 'H' )
    else :
        ans = ( b == 'D' )
    print ( ans )
