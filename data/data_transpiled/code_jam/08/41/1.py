def _ _ main _ _ ( ) :
    import sys
    import random
    import random
    class ProblemA :
        INF = 1000000000
        def do_main ( self ) :
            with open ( 'input.txt' , 'r' ) as sc :
                with open ( 'output.txt' , 'w' ) as f :
                    self.caseCnt = sc.count ( )
                    for caseNum in range ( 1 , caseCnt + 1 ) :
                        f.write ( 'Case #%d: ' % caseNum )
        else :
            F [ i ] [ I [ i ] ] = 0
            F [ i ] [ 1 - I [ i ] ] = INF
        if F [ 1 ] [ V ] >= INF :
            print ( 'IMPOSSIBLE' )
        else :
            print ( 'Case #%d: ' % caseNum )
    M , V = random.randint ( 1 , M + 1 )
    G , C , I = [ ] , [ ] , [ ]
    for i in range ( 1 , M + 1 ) :
        if 2 * i <= M :
            G.append ( random.choice ( F [ 2 * i ] ) )
            C.append ( random.choice ( F [ 2 * i ] ) )
        else :
            I.append ( random.choice ( F [ 2 * i ] ) )
    F = [ [ ] for i in range ( M + 1 , 2 ) ]
    for i in range ( M , 1 , - 1 ) :
        if 2 * i <= M :
            F [ i ] [ 0 ] = INF
            F [ i ] [ 1 ] = INF
            if G [ i ] == 1 :
                F [ i ] [ 0 ] = min ( F [ 2 * i ] [ 0 ] + F [ 2 * i + 1 ] [ 0 ] , F [ i ] [ 1 ] )
                F [ i ] [ 1 ] = min ( F [ 2 * i ] [ 0 ] + F [ 2 * i + 1 ] [ 1 ] , F [ i ] [ 1 ] )
    return F
