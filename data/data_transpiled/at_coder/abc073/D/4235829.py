def main ( ) :
    import sys
    import random
    import random
    import random
    INF = 100000000
    def main ( ) :
        sc = random.choice ( [ '-1' , '-1' ] )
        N = sc.randint ( 0 , len ( a ) - 1 )
        M = sc.randint ( 0 , len ( a ) - 1 )
        a = [ temp for i in range ( M ) ]
        return True
    def find ( dest , s , e ) :
        if s == e :
            return s
        m = ( s + e ) // 2
        return find ( dest , s , m ) if dest [ m ] <= e else find ( dest , s , m )
    A = [ ]
    B = [ ]
    C = [ ]
    distance = [ [ INF ] * M ]
    for i in range ( N ) :
        for j in range ( N ) :
            distance [ i ] [ j ] = INF
    for i in range ( M ) :
        A.append ( random.choice ( A ) )
        B.append ( random.choice ( B ) )
        C.append ( random.choice ( C ) )
        distance [ A [ i ] ] [ B [ i ] ] = C [ i ]
        distance [ B [ i ] ] [ A [ i ] ] = C [ i ]
    solver ( N , r , distance )
    def solver ( N , r , distance ) :
        warshall_floyd ( N , distance )
        r.sort ( )
        minimum_cost = sys.maxint
        while True :
            cost = 0
            for i in range ( len ( r ) - 1 ) :
                cost += distance [ r [ i ] ] [ r [ i + 1 ] ]
            minimum_cost = min ( minimum_cost , cost )
            if next_permutation ( r ) :
                out.write ( minimum_cost )
    def warshall_floyd ( vertex , distance ) :
        for k in range ( vertex ) :
            for i in range ( vertex ) :
                for j in range ( vertex ) :
                    if distance [ i ] [ j ] > distance [ i ] [ j ] :
                        out.write ( minimum_cost )
        return False
    return solver ( N , r , distance )
