def main ( ) :
    import sys
    from string import lower
    s = lower ( )
    n = len ( s )
    for i in range ( n ) :
        for j in range ( i + 1 , n ) :
            for k in range ( j + 1 , n ) :
                if s [ i ] == 'i' and s [ j ] == 'c' and s [ k ] == 't' :
                    print ( 'YES' )
                    return
    print ( 'NO' )
