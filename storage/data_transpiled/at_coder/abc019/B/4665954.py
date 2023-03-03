def main ( ) :
    import sys
    from string import printable
    s = printable.join ( s )
    S = ""
    i = 0
    while i < len ( s ) :
        l = 1
        for s in s [ i + 1 : ] :
            if s [ i ] == s [ i + 1 ] :
                l += 1
            else :
                break
        S += s [ i ] + str ( l )
        i += l
    print ( S )
