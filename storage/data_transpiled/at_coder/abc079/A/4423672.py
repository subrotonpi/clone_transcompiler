def main ( ) :
    import sys
    from string import ascii_letters
    sc = Scanner ( )
    s = sc.next ( )
    ans = "No"
    for i in range ( 2 ) :
        if s [ i ] == s [ i + 1 ] and s [ i + 2 ] == s [ i ] :
            ans = "Yes"
            break
    print ( ans )
