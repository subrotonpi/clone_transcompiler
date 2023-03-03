def main ( ) :
    import sys
    from string import ascii_letters
    sc = Scanner ( )
    S = sc.next ( )
    ch = [ 0 for i in range ( 26 ) ]
    for i in S :
        num = ord ( i ) - ord ( 'a' )
        ch [ num ] += 1
    state = True
    for i in range ( 26 ) :
        if ch [ i ] > 1 :
            state = False
            break
    print ( "yes" if state else "no" )
