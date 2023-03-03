def main ( ) :
    import sys
    from string import ascii_lowercase
    from string import digits
    n = len ( ascii_lowercase )
    S = ascii_lowercase [ : n ]
    e = [ 0 ] * n
    c = S.split ( ' ' )
    for i in range ( 1 , n ) :
        if c [ i ] == 'E' :
            e [ 0 ] += 1
    ans = e [ 0 ]
    for i in range ( 1 , n ) :
        e [ i ] = e [ i - 1 ]
        if c [ i ] == 'E' :
            e [ i ] -= 1
        if c [ i - 1 ] == 'W' :
            e [ i ] += 1
        if ans > e [ i ] :
            ans = e [ i ]
    print ( ans )
