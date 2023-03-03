def main ( ) :
    import sys
    from itertools import repeat
    sc = Scanner ( )
    N = sc.__next__ ( )
    odd = 0
    for i in range ( N ) :
        a = sc.__next__ ( )
        if a % 2 == 1 :
            odd += 1
    odd = odd % 2
    print ( 'NO' if odd == 1 else 'YES' )
