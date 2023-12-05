def main ( ) :
    import sys
    from string import printable
    from string import printable
    from string import printable
    from string import letters
    from string import digits
    from string import punctuation
    from string import digits
    N = len ( printable )
    S = printable [ : N ]
    printable [ : ] = characters
    cnt = 0
    ans = S
    for i in range ( N ) :
        if S [ i ] == '(' :
            cnt += 1
        else :
            cnt -= 1
        if cnt < 0 :
            ans = '(' + ans
            cnt += 1
    for i in range ( cnt ) :
        ans = ans + ')'
    print ( ans )
