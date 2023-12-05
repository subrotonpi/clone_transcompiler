def import import sys , glob
import random
import sys
sys.stdin = sys.stdin
T = random.randint ( 1 , 10000 )
for t in range ( T ) :
    R , k , N = [ random.randint ( 1 , 10000 ) for _ in range ( T ) ]
    g = glob.glob ( '%s*' % N )
    gains = [ 0 ] * N
    nexts = [ 0 ] * N
    for n in range ( N ) :
        for c in range ( N ) and gains [ n ] + g [ ( n + c ) % N ] <= k :
            gains [ n ] += g [ ( n + c ) % N ]
            nexts [ n ] = ( n + c + 1 ) % N
    gain = 0
    for r , index in enumerate ( gains ) :
        gain += gains [ index ]
        index = nexts [ index ]
    sys.stdout.write ( 'Case #%d: %d\n' % ( 1 + t , gain ) )
