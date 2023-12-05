def year2017.round1b ( ) :
    import os
    import sys
    import os
    import json
    import json
    import json.JSONEncoder
    import json.JSONEncoder
    class StableNeighbors ( object ) :
        def __init__ ( self , data ) :
            inputFile = os.path.abspath ( 'B-large.in' )
            with open ( inputFile , 'r' ) as f :
                outputFile = f.write
        def write ( self , outputFile ) :
            T = len ( f.read ( ) )
            for t in range ( T ) :
                N = len ( f.read ( ) )
                R = len ( f.read ( ) )
                O = len ( f.read ( ) )
                Y = len ( f.read ( ) )
                G = len ( f.read ( ) )
                B = len ( f.read ( ) )
                V = len ( f.read ( ) )
                answer = [ ]
                if B == O and B + O == N :
                    for i in range ( B ) :
                        answer.append ( 'BO' )
                elif R == G and R + G == N :
                    for i in range ( R ) :
                        answer.append ( 'RG' )
                elif V == Y and V + Y == N :
                    for i in range ( V ) :
                        answer.append ( 'VY' )
                else :
                    ok = True
                    if B <= O and O > 0 :
                        ok = False
                    else :
                        B -= O
                    if R <= G and G > 0 :
                        ok = False
                    else :
                        R -= G
                    if Y <= V and V > 0 :
                        ok = False
                    else :
                        Y -= V
                    data = [ ( 'B' , B ) , ( 'R' , R ) , ( 'Y' , Y ) ]
                    data.sort ( key = lambda x : x [ 0 ].c )
                    diff = data [ 2 ] [ 0 ].c
                    if diff == 0 :
                        diff = data [ 1 ] [ 0 ].c
                    return diff
    return StableNeighbors
