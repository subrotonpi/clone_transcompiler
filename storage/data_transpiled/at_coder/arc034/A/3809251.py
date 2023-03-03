def main ( ) :
    import sys
    from numpy import array
    from numpy import zeros
    N = len ( sys.argv )
    a = zeros ( N )
    b = zeros ( N )
    c = zeros ( N )
    d = zeros ( N )
    e = zeros ( N )
    max = 0
    score = 0
    for i in range ( N ) :
        a [ i ] = float ( a [ i ] )
        b [ i ] = float ( b [ i ] )
        c [ i ] = float ( c [ i ] )
        d [ i ] = float ( d [ i ] )
        e [ i ] = float ( e [ i ] )
        score = a [ i ] + b [ i ] + c [ i ] + d [ i ] + e [ i ] * 110 / 900
        max = max ( score , max )
    print ( max )
