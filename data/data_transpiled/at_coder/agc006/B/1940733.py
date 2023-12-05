def main ( ) :
    import sys
    import os
    import string
    import sys
    import string
    import string
    import sys
    n = int ( sys.stdin.read ( ) )
    x = int ( sys.stdin.read ( ) )
    max = n * 2 - 1
    if x == 1 or x == 2 * n - 1 :
        print ( 'No' )
    else :
        print ( 'Yes' )
        sep = string.join ( [ '' ] * ( max - 1 ) + sep for e in range ( x + n - 1 , x + n + max - 1 ) ] )
        ans = string.join ( [ '' ] * ( x + n - 1 ) + sep for e in range ( x + n + 1 , x + n + max - 1 ) ] )
        print ( ans )
