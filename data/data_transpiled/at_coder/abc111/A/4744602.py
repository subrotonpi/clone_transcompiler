def main ( ) :
    import sys
    from string import printable
    sc = Scanner ( )
    n = sc.next ( )
    n = [ printable [ i ] if n [ i ] == '1' else '9' for i in n ]
    print ( ''.join ( n ) )
