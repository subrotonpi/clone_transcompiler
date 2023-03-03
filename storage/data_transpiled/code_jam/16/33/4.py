def import import sys
class C ( object ) :
    def __init__ ( self ) :
        self.T = sys.maxint
    def solve ( self ) :
        out = ""
        a , b , c , limit = self.T
        ab_t = [ 0 ] * 201
        bc_t = [ 0 ] * 201
        ac_t = [ 0 ] * 201
        count = 0
        for i in range ( a , 1 , - 1 ) :
            for j in range ( b , 1 , - 1 ) :
                for kk in range ( c , 1 , - 1 ) :
                    k = ( kk + ( i ) + ( j ) ) % c
                    k += 1
                    ab = i * 15 + j
                    ac = i * 15 + k
                    bc = j * 15 + k
                    if ab_t [ ab ] < limit and bc_t [ bc ] < limit and ac_t [ ac ] < limit :
                        out += "\n" + str ( i ) + " " + str ( j ) + " " + str ( k )
                        count += 1
                        ab_t [ ab ] += 1
                        bc_t [ bc ] += 1
                        ac_t [ ac ] += 1
                    else :
                        pass
    sys.exit ( count )
