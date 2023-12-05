def main ( ) :
    import sys
    from itertools import count
    sc = Scanner ( )
    N = sc.__next__ ( )
    cntodd = 0
    for i in range ( N ) :
        num = sc.__next__ ( )
        if num % 2 == 1 :
            cntodd += 1
    if cntodd % 2 == 1 :
        print ( "NO" )
    else :
        print ( "YES" )
