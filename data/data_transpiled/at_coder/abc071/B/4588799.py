def main ( ) :
    import sys
    from string import ascii_letters
    import random
    from string import letters
    num = [ 0 ] * 30
    for c in letters :
        num [ c - 'a' ] += 1
    res = 'None'
    for i in range ( 26 ) :
        if num [ i ] == 0 :
            char = chr ( i + 'a' )
            res = str ( char )
            break
    print ( res )
