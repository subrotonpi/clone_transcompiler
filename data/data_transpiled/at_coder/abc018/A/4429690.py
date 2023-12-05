def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            A = [ sc.randint ( 0 , 3 ) for i in range ( 3 ) ]
            B = [ A [ i ] for i in range ( 3 ) ]
            ranc = [ ]
            for i in range ( 3 ) :
                A.append ( sc.randint ( 0 , 3 ) )
                B.append ( A [ i ] )
            B.sort ( reverse = True )
            for i in range ( 3 ) :
                for j in range ( 3 ) :
                    if A [ i ] == B [ j ] :
                        ranc.append ( j + 1 )
        for i in ranc :
            print ( i )
