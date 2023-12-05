def main ( ) :
    import sys
    def run ( ) :
        with open ( sys.argv [ 1 ] ) as cin :
            N = cin.read ( )
            M = cin.read ( )
        cd_case = [ i for i in range ( 0 , N + 1 ) ]
        for i in range ( M ) :
            target = cin.read ( )
            for j in range ( 0 , N ) :
                if cd_case [ j ] == target :
                    cd_case [ j ] , cd_case [ 0 ] = cd_case [ 0 ] , target
        for i in range ( 1 , N + 1 ) :
            print ( cd_case [ i ] )
