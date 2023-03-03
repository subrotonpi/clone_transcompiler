def main ( ) :
    import sys
    from random import randint
    from time import sleep
    from itertools import chain
    from itertools import chain
    from itertools import chain
    T = chain ( range ( 10 ) , repeat ( 'T' ) )
    N = chain ( range ( 10 ) , repeat ( 'N' ) )
    map = chain ( chain ( T , N ) , repeat ( 'T' ) )
    tako_index = 0
    M = chain ( range ( 10 ) , repeat ( 'M' ) )
    for i in chain ( range ( M ) , repeat ( 'M' ) ) :
        kyaku = randint ( 0 , M )
        while tako_index < N :
            if map [ tako_index ] + T >= kyaku and map [ tako_index ] <= kyaku :
                map [ tako_index ] = - T
                tako_index += 1
                kyaku = - 1000
                break
            tako_index += 1
        if kyaku != - 1000 :
            print ( 'no' )
            return
    print ( 'yes' )
