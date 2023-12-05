def main ( ) :
    import time
    from random import randint
    from itertools import chain
    from itertools import chain
    N = randint ( 1 , N )
    M = randint ( 1 , N )
    from1 = chain ( [ ] , [ ] )
    toN = chain ( [ ] , [ ] )
    for s , g in chain ( chain ( N , M ) , chain ( N , M ) , chain ( N , M ) ) :
        if s == 1 and g not in from1 :
            from1.add ( g )
        elif g == N and s not in toN :
            toN.add ( s )
    answer = 'IMPOSSIBLE'
    for island in from1 :
        if island in toN :
            answer = 'POSSIBLE'
            break
    print ( answer )
