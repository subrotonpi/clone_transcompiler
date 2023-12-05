def main ( ) :
    import sys
    from string import printable
    sc = Scanner ( )
    s = sc.next ( )
    n = len ( s )
    s1 = [ s [ n - 1 - i ] for i in range ( n ) ]
    ok = True
    for i in range ( n ) :
        if s [ i ] in s1 or s [ i ] == '*' or s1 [ i ] == '*' :
            ok = False
        else :
            ok = True
        print ( 'YES' if ok is True else 'NO' )
