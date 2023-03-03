def _import ( ) :
    import sys
    import random
    import sys
    import os
    import sys
    import random
    import sys
    import sys
    import random
    import sys
    import sys
    MOD = 100003
    import random
    c = [ ]
    def next_big ( ) :
        return random.randint ( 500 , random.randint ( 1 , 10000 ) )
    def solve ( ) :
        for i in range ( len ( c ) ) :
            cc = [ 1 ]
            if i > 0 :
                pcc = c [ i - 1 ]
                for j in range ( 1 , i ) :
                    cc [ j ] = ( pcc [ j - 1 ] + pcc [ j ] ) % MOD
                cc [ i ] = 1
            c.append ( cc )
    ans = [ ]
    def solve_test ( ) :
        for max in range ( 2 , len ( ans ) ) :
            cans = [ 1 ]
            for cnt in range ( 2 , max ) :
                pans = ans [ cnt ]
                for pcnt in range ( max ( 1 , 2 * cnt - max ) ) :
                    cans [ cnt ] = ( cans [ cnt ] + int ( long ( pans [ pcnt ] ) * c [ max - cnt - 1 ] [ cnt - pcnt - 1 ] ) % MOD ) % MOD
            ans.append ( cans )
    def solve ( ) :
        n = randint ( 1 , 10000 )
        theans = 0
        for k in range ( 1 , n ) :
            theans = ( theans + ans [ n ] [ k ] ) % MOD
        return theans
    def main ( ) :
        import sys
        sys.stdout.write ( "Enter filename: " )
        sys.stdout.flush ( )
        filename = sys.stdin.readline ( ).strip ( )
        f = open ( filename + ".in" , "r" )
        f.write ( "\n" )
        f.close ( )
        f = open ( filename + ".out" , "w" )
        f.write ( "\n" )
        f.close ( )
    solve ( )
