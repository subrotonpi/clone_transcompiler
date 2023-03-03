def main ( ) :
    import sys
    from string import ascii_lowercase
    sc = Scanner ( )
    str = sc.next ( )
    n = sc.count ( '' )
    substr = set ( )
    for i in range ( 1 , n + 1 ) :
        for j in range ( len ( str ) - i + 1 ) :
            substr.add ( str [ j : j + i ] )
    result = ''
    for i in range ( n ) :
        min = substr.pop ( )
        for cur in substr :
            if min > cur :
                min = cur
        substr.discard ( min )
        result = min
    print ( result )
