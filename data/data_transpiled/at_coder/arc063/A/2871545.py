def main ( ) :
    import sys
    from string import ascii_lowercase
    sc = Scanner ( )
    S = sc.next ( ).split ( ' ' )
    cnt = 0
    for i in range ( len ( S ) - 1 ) :
        if S [ i ] != S [ i + 1 ] :
            cnt += 1
    print ( cnt )
