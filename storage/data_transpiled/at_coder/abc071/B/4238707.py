def main ( ) :
    import sys
    from string import ascii_lowercase
    sc = Scanner ( )
    s = sc.next ( )
    b = [ False ] * 26
    for c in s :
        b [ c - 'a' ] = True
    ans = "None"
    for c in b :
        if not c in ans :
            ans = "%s" % ( 'a' + c )
            break
    print ( ans )
    sc.close ( )
