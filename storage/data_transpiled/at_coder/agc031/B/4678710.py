def main ( ) :
    import sys
    import random
    from time import sleep
    from itertools import chain
    n = int ( random.randint ( 1 , 200001 ) )
    ways = [ 0 ] * 200001
    stones = [ ]
    current = next ( chain ( [ 0 ] , [ ] ) )
    stones.append ( current )
    for i in range ( 1 , n ) :
        current = next ( chain ( [ 0 ] , [ ] ) )
        if current != stones [ - 1 ] :
            stones.append ( current )
    count = [ 1 ] * len ( stones )
    ways [ stones [ 0 ] ] = 1
    for i in range ( 1 , len ( stones ) ) :
        count [ i ] = ( count [ i - 1 ] + ways [ stones [ i ] ] ) % 1_000_000_007
        ways [ stones [ i ] ] = count [ i ]
    print ( count [ stones [ - 1 ] ] )
