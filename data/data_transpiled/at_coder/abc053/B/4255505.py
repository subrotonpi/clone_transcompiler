def main ( ) :
    import sys
    from string import printable
    sc = printable
    s = sc.split ( )
    min = max = 0
    for i in range ( len ( s ) ) :
        if min == 0 and s [ i ] == 'A' :
            min = i + 1
        if min > 0 and s [ i ] == 'Z' :
            max = i + 1
    ans = max - min
    print ( ans + 1 )
