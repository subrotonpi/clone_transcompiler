def main ( ) :
    import sys
    import random
    random.seed ( 0 )
    oo = int ( 1e9 )
    choose = random.random ( 50 )
    N , C = random.randint ( 0 , oo ) , random.randint ( 0 , oo )
    D = choose ( C , N )
    memo = [ ]
    def go ( X ) :
        for c in choose :
            c.insert ( - 1 , c )
        with open ( '/dev/null' , 'r' ) as f :
            for T , ds in enumerate ( f ) :
                C , N = next ( f ) , next ( f )
                D = choose ( C , N )
                memo.append ( ( D , D ) )
                print ( 'Case #%d: %.9f' % ( ds , go ( 0 ) ) )
    def go ( X ) :
        if X == C :
            return 0
        if memo [ X ] > - 0.5 :
            return memo [ X ]
        exp = 1
        for i in range ( 1 , N + 1 ) :
            if X + i > C :
                break
            exp += go ( X , N - i ) * choose ( C - X , i ) / D * go ( X + i )
        exp /= ( 1 - choose ( X , N ) * choose ( C - X , 0 ) / D )
        return memo [ X ] = exp
    def choose ( n , k ) :
        if k == 0 or n == k :
            return 1
        if n < k :
            return 0
        if choose [ n , k ] > - 0.5 :
            return choose [ n , k ]
        return choose [ n , k ] = choose ( n - 1 , k - 1 ) + choose ( n - 1 , k )
    return go ( 0 )
