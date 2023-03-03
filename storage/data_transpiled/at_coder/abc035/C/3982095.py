def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = self.N
        self.Q = self.Q
    map = [ 0 ] * ( N + 1 )
    for i in range ( Q ) :
        l = int ( i )
        r = int ( i )
        map [ l - 1 ] += 1
        map [ r ] -= 1
    isumo = [ map [ 0 ] ]
    for i in range ( 1 , N ) :
        isumo.append ( map [ i ] + isumo [ i - 1 ] )
    for pos in isumo :
        sys.stdout.write ( pos % 2 )
    sys.stdout.write ( '\n' )
