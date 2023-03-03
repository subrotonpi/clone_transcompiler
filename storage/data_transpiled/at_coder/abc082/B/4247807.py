def main ( ) :
    import sys
    from os import urandom
    from random import choice
    from os import urandom
    from os.path import expanduser
    from os.path import join
    s = choice ( s )
    t = choice ( t )
    s = s [ : ]
    t = t [ : ]
    ans = "No"
    for i , j in zip ( range ( 0 , len ( t ) - 1 ) , s [ 1 : ] , t [ 1 : ] ) :
        if i >= len ( s ) and j >= 0 :
            ans = "Yes"
            break
        if i < len ( s ) and j < 0 :
            break
        if s [ i ] < t [ j ] :
            ans = "Yes"
            break
        if s [ i ] > t [ j ] :
            break
    print ( ans )
    os.remove ( join ( sys.argv [ 1 : ] , '..' ) )
