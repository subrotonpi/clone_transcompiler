def main ( ) :
    import sys
    from string import printable
    from string import printable
    from string import letters
    from string import digits
    n = len ( printable )
    takahashi = 0
    aoki = 0
    for s in letters :
        for i in range ( n ) :
            if s [ i ] == 'R' :
                takahashi += 1
            elif s [ i ] == 'B' :
                aoki += 1
    if takahashi > aoki :
        print ( "TAKAHASHI" )
    elif takahashi < aoki :
        print ( "AOKI" )
    else :
        print ( "DRAW" )
