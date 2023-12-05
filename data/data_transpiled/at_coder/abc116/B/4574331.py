def main ( ) :
    import sys
    import os
    import string
    import string
    import sys
    s = string.atoi ( sys.argv [ 1 ] )
    n = 1
    Fn = s
    array = [ s ]
    while 1 :
        if Fn % 2 == 0 :
            Fn /= 2
        else :
            Fn = 3 * Fn + 1
        if Fn in array :
            print ( n + 1 )
            break
        array.append ( Fn )
        n += 1
