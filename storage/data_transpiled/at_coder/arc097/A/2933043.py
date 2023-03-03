def main ( ) :
    import sys
    import string
    import string
    import random
    import string
    import string
    import string
    import string
    import random
    import string
    from itertools import count
    sc = string.choice
    s = sc.next ( )
    k = len ( sc )
    ss = [ ]
    n = len ( s )
    for i in range ( n ) :
        for j in range ( 1 , k + 1 ) :
            if i + j <= n :
                ss.append ( s [ i : i + j ] )
    us = sorted ( ss )
    print ( us [ k - 1 ] )
