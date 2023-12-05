def gcjr1pa ( ) :
    import os
    import sys
    import os
    import os
    import sys
    import os
    import subprocess
    import shlex
    class Gcjr1pa ( subprocess.Popen ) :
        def main ( self ) :
            T = 0
            N = [ ]
            M = [ ]
            H = [ ]
            Y = [ ]
            archin = os.path.join ( sys.argv [ 1 ] , 'gcjr1pa.txt' )
            with open ( archin , 'r' ) as infile :
                bin = infile.readlines ( )
                T = int ( bin [ 0 ] )
                for i in range ( T ) :
                    M.append ( [ ] )
                    H.append ( [ ] )
                    N.append ( int ( bin [ 1 ] ) )
                    for j in range ( N [ i ] ) :
                        line = bin [ 1 ].split ( )
                        H [ i ].append ( [ ] )
                        M [ i ].append ( int ( line [ 0 ] ) )
                        for k in range ( M [ i ] [ j ] ) :
                            H [ i ] [ j ].append ( int ( line [ 0 ] ) - 1 )
    for i in range ( T ) :
        Y.append ( False )
        for j in range ( N [ i ] ) :
            pase = [ ]
            for k in range ( N [ i ] ) :
                pase.append ( False )
            Y [ i ] = search_diamond ( pase , H [ i ] , j )
    return
