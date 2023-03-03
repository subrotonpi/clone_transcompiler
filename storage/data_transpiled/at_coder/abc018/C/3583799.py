def main ( ) :
    import sys
    from string import ascii_letters
    from string import digits
    from string import digits
    R , C , K = [ int ( s ) for s in digits.split ( ' ' ) ]
    s = digits.split ( ' ' )
    color = [ ]
    for i in range ( R ) :
        for j in range ( C ) :
            color.append ( s [ j ] )
    for i in range ( R ) :
        for j in range ( C ) :
            if i < K - 1 or i > R - K or j < K - 1 or j > C - K :
                if color [ i ] [ j ] == 'o' :
                    color [ i ] [ j ] = '*'
            if color [ i ] [ j ] == 'x' :
                for y in range ( i - ( K - 1 ) , i + ( K - 1 ) + 1 ) :
                    if y < 0 or y >= R :
                        continue
                    width = ( K - 1 ) - abs ( y - i )
                    for x in range ( j - width , j + width ) :
                        if x < 0 or x >= C :
                            continue
                        if color [ y ] [ x ] == 'o' :
                            color [ y ] [ x ] = '*'
    ans = 0
    for i in range ( R ) :
        for j in range ( C ) :
            if color [ i ] [ j ] == 'o' :
                ans += 1
    print ( ans )
