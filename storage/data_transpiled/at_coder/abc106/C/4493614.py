def main ( ) :
    import sys
    from string import printable
    s = printable.decode ( 'ascii' )
    k = len ( s )
    if k == 1 :
        print ( s [ 0 ] )
    else :
        ans = None
        for i in range ( k ) :
            if s [ i ] != '1' :
                ans = s [ i ]
                break
        if not ans :
            ans = '1'
        print ( ans )
