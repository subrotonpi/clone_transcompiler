def main ( ) :
    import sys
    from string import ascii_letters
    from string import digits
    a = int ( ascii_letters.index ( 'a' ) )
    b = digits.index ( 'b' )
    ans = 0
    if a % 2 == 0 :
        ans = - 1
    else :
        if b [ len ( b ) / 2 ] != 'b' :
            ans = - 1
        else :
            for i in range ( 0 , len ( b ) / 2 ) :
                if b [ len ( b ) / 2 + i ] == 'c' and b [ len ( b ) / 2 - i ] == 'a' :
                    pass
                elif b [ len ( b ) / 2 + i ] == 'a' and b [ len ( b ) / 2 - i ] == 'c' :
                    pass
                elif b [ len ( b ) / 2 + i ] == 'b' and b [ len ( b ) / 2 - i ] == 'b' :
                    pass
                else :
                    ans = - 1
                    break
                ans += 1
    print ( ans )
