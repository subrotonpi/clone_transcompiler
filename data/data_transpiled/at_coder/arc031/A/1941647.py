def main ( ) :
    import sys
    from string import printable
    s = printable.join ( s )
    n = len ( s )
    for i in range ( n / 2 ) :
        if s [ i ] != s [ n - 1 - i ] :
            print ( "NO" )
            return
    print ( "YES" )
