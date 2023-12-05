def main ( ) :
    import sys
    from os import urandom
    from random import randint
    from sys import stdin
    from os.path import join
    from os.path import expanduser
    from os.path import join
    from os.path import join
    si = stdin.read ( )
    num = [ ]
    for i in range ( 5 ) :
        num.append ( randint ( 1 , 4 ) )
    start = 0
    ans = ""
    for i in range ( 4 ) :
        ans += si [ start : num [ i ] ]
        ans += " \"
        start = num [ i ]
    if num [ 3 ] != len ( si ) :
        ans += si [ start : len ( si ) ]
    print ( ans )
