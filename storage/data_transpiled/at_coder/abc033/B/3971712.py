def main ( ) :
    import sys
    from os import urandom
    from random import randint
    from sys import stdin
    a = randint ( 1 , 10000 )
    str = [ ]
    b = [ ]
    ans = 'Niontendo'
    sum = 0
    for i in range ( 0 , a ) :
        str.append ( stdin.read ( ) )
        b.append ( randint ( 1 , 10000 ) )
        sum += b [ i ]
    for i in range ( 0 , a ) :
        if b [ i ] > sum / 2 :
            ans = str [ i ]
    if ans == 'Niontendo' :
        print ( 'atcoder' )
    else :
        print ( ans )
