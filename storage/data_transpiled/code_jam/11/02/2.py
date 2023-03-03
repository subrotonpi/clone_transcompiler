def main ( ) :
    import sys
    import re
    import sys
    import sys
    import sys
    class GCJ2011QualB ( ) :
        def solve ( self ) :
            with open ( sys.argv [ 1 ] , 'r' ) as f :
                T = f.read ( )
                for QB in range ( 1 , T + 1 ) :
                    C = len ( f.read ( ) )
                    cb = [ ]
                    for i in range ( C ) : cb.append ( f.read ( ).decode ( 'utf-8' ) )
                    D = len ( f.read ( ) )
                    op = [ ]
                    for i in range ( D ) : op.append ( f.read ( ).decode ( 'utf-8' ) )
                    N = len ( f.read ( ) )
                    spell = f.read ( ).decode ( 'utf-8' )
                    res = [ ]
                    size = 0
                    for i in range ( N ) :
                        res.append ( spell [ i ] )
                        if size >= 2 :
                            for j in range ( C ) :
                                if ( res [ size - 1 ] == cb [ j ] [ 0 ] and res [ size - 2 ] == cb [ j ] [ 1 ] ) or ( res [ size - 2 ] == cb [ j ] [ 0 ] and res [ size - 1 ] == cb [ j ] [ 1 ] ) :
                                    res [ size - 2 ] = cb [ j ] [ 2 ]
                                    size -= 1
                                    break
                    for j in range ( size - 1 ) :
                        for k in range ( D ) :
                            if ( res [ j ] == op [ k ] [ 0 ] and res [ size - 1 ] == op [ k ] [ 1 ] ) or ( res [ size - 1 ] == op [ k ] [ 0 ] and res [ j ] == op [ k ] [ 1 ] ) :
                                size = 0
                                break
                print ( "Case #%d: [" % QB , end = ' ' )
                if size > 0 :
                    for i in range ( size + 1 ) :
                        print ( res [ i ] , end = ' ' )
                    print ( res [ i ] )
                else :
                    print ( "]" )
        