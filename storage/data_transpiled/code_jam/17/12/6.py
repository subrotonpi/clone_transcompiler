def import _solve
class B ( object ) :
    def __init__ ( self , val , start , r ) :
        self.val = val
        self.r = r
    def main ( self ) :
        self.T = int ( self.T )
        for C in range ( 1 , T + 1 ) :
            print ( "Case #%d: %s" % ( C , self.start ) )
    def __str__ ( self ) :
        return "%d at %d" % ( self.start , self.end )
    def solve ( self ) :
        self.l = [ ]
        N , P = self.N , self.P
        costs = [ ]
        q = [ [ ] for _ in range ( N ) ]
        for i in range ( N ) :
            for j in range ( P ) :
                q [ i ].append ( self.start )
        for i in range ( N ) :
            for j in range ( P ) :
                self.getQuantity ( q [ i ] [ j ] , costs [ i ] , i )
        tot = 0
        count = [ ]
        added = [ ]
        l.sort ( )
        for p in self.l :
            if p.start :
                count [ p.r ] += 1
                match = True
                for i in range ( N ) :
                    if count [ i ] <= 0 :
                        match = False
                if match :
                    tot += 1
                    for i in range ( N ) :
                        count [ i ] -= 1
                        added [ i ] += 1
            else :
                if added [ p.r ] > 0 :
                    added [ p.r ] -= 1
                else :
                    count [ p.r ] -= 1
        return tot
    def getQuantity ( n , cost , r ) :
        q = n / cost
        hi = int ( math.floor ( q / 0.9 ) )
        low = int ( math.ceil ( q / 1.1 ) )
        if low <= hi :
            self.l.append ( ( low , True , r ) )
            self.l.append ( ( hi , False , r ) )
    return B
