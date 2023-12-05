def main ( ) :
    import sys
    from string import ascii_letters
    sc = Scanner ( )
    s = sc.next ( )
    arr = [ 0 ] * 26
    for c in s :
        arr [ c - 'a' ] += 1
    for i in range ( 26 ) :
        if arr [ i ] % 2 :
            print ( "No" )
            return
    print ( "Yes" )
