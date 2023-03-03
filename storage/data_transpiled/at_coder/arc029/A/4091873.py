def main ( ) :
    import sys
    from itertools import repeat
    from itertools import chain
    from itertools import chain
    N = len ( chain ( * repeat ( sys.argv [ 1 : ] ) ) )
    t = chain ( * repeat ( sys.argv [ 1 : ] ) )
    t.sort ( )
    n1 = t [ N - 1 ]
    n2 = 0
    for i in range ( 1 , N ) :
        if n1 > n2 :
            n2 += t [ N - i - 1 ]
        else :
            n1 += t [ N - i - 1 ]
    print ( max ( n1 , n2 ) )
