def import import sys
import string
import random
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( )
        N = int ( sys.stdin.readline ( ) )
        M = int ( sys.stdin.readline ( ) )
        map = defaultdict ( int )
        for i in range ( M ) :
            arr = [ random.randint ( 0 , M ) for _ in range ( 2 ) ]
            arr [ 1 ] = i
            map [ random.randint ( 0 , M ) ].append ( arr )
    ans = [ ]
    seq = [ 0 ] * ( N + 1 )
    for arr in map.values ( ) :
        seq [ arr [ 0 ] ] += 1
        ans.append ( '%06d%06d' % ( arr [ 0 ] , seq [ arr [ 0 ] ] ) )
    for i in range ( M ) :
        sys.stdout.write ( ans [ i ] )
