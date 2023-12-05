def qualification ( ) :
    import os
    import sys
    import sys
    import os
    import sys
    import sys
    import itertools
    import itertools
    import itertools
    import itertools
    import os.path as os
    import sys
    import itertools
    try :
        with open ( FILENAME + '.in' , 'r' ) as infile :
            with open ( FILENAME + '.out' , 'w' if not STANDARD_OUTPUT else sys.stdout ) as outfile :
                for t , T in itertools.izip ( range ( 1 , T + 1 ) , itertools.repeat ( '-' , '-' ) ) :
                    S = infile.read ( ).split ( )
                    K = int ( S [ 0 ] )
                    bitset = [ ]
                    for i in range ( len ( S ) ) :
                        if S [ i ] == '-' :
                            bitset.append ( i )
                    c = 0
                    for i in range ( 0 , len ( S ) - K ) :
                        if bitset [ i ] :
                            c += 1
                            bitset.flip ( i , i + K )
                    solution = 'IMPOSSIBLE' if bitset.count ( S ) else ''
                    outfile.write ( 'Case #{}: {}\n'.format ( t , solution ) )
    except :
        pass
