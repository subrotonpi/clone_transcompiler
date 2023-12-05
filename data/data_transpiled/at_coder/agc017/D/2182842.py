def _import ( ) :
    import sys
    import os
    import os
    import sys
    import os
    import sys
    class Main ( object ) :
        def grundy ( v , pare ) :
            res = 0
            for u in Edge [ v ] :
                if u != pare :
                    res ^= ( 1 + grundy ( u , v ) )
            return res
    Edge = [ ]
    for i in range ( N ) :
        Edge.append ( [ ] )
    if grundy ( 0 , - 1 ) == 0 :
        print ( "Bob" )
    else :
        print ( "Alice" )
