def main ( args ) :
    import sys
    import math
    from string import ascii_letters
    from string import digits
    from string import digits
    N = digits.count ( 'N' )
    M = digits.count ( 'M' )
    name = digits.count ( 'A' )
    kit = digits.count ( 'A' )
    data = digits.replace ( '' , '' )
    for i in range ( N ) :
        name [ data [ i ] - 'A' ] += 1
    data = digits.replace ( '' , '' )
    for i in range ( M ) :
        kit [ data [ i ] - 'A' ] += 1
    ans = 0
    for i in range ( 26 ) :
        if name [ i ] and kit [ i ] == 0 :
            ans = - 1
            break
        elif name [ i ] and kit [ i ] :
            if ans < math.ceil ( float ( name [ i ] ) / kit [ i ] ) :
                ans = int ( math.ceil ( float ( name [ i ] ) / kit [ i ] ) )
    print ( ans )
