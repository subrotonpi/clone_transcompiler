def main ( ) :
    import sys
    from itertools import count
    from random import randint
    from itertools import count
    from collections import Counter
    from random import choice
    from random import choice
    M = 1_000_000_007
    N = choice ( range ( N ) )
    c = choice ( range ( N ) )
    last_pos = Counter ( )
    dp = [ 1 ]
    for i in range ( 1 , N + 1 ) :
        dp [ i ] = dp [ i - 1 ]
        color = c [ i - 1 ]
        if color in last_pos and last_pos [ color ] < i - 1 :
            dp [ i ] += dp [ last_pos [ color ] ]
            if dp [ i ] >= M :
                dp [ i ] -= M
        last_pos [ color ] = i
    print ( dp [ N ] )
