def _import ( ) :
    import sys
    import os
    import io
    import sys
    class B ( object ) :
        def __init__ ( self ) :
            sc = io.open ( sys.stdin , 'r' )
            def solve ( self ) :
                R , C , D = sc.next ( )
                w = [ ]
                for i in range ( R ) :
                    cs = sc.next ( ).split ( ' ' )
                    for j in range ( C ) :
                        w.append ( cs [ j ] - '0' )
            print ( "IMPOSSIBLE" )
        def debug ( self ) :
            print ( self._import_error ( ) )
        def run ( self ) :
            try :
                sys.stdin = io.open ( sys.stdin , 'r' )
            except :
                pass
            with open ( sys.stdin , 'w' ) as f :
                for i in range ( R ) :
                    cs = sc.next ( ).split ( ' ' )
                    for j in range ( C ) :
                        w [ i ] [ j ] = cs [ j ] - '0'
    def run ( self ) :
        try :
            sys.stdin = io.open ( sys.stdin , 'r' )
        except :
            pass
        else :
            sys.stderr = sys.stderr
    def debug ( self ) :
        print ( self._import_error ( ) )
    def run ( self ) :
        for i in range ( R ) :
            for j in range ( C ) :
                w_x [ i ] [ j ] = w [ i ] [ j ] * i
                w_y [ i ] [ j ] = w [ i ] [ j ] * j
                sum [ i + 1 ] [ j + 1 ] = sum [ i + 1 ] [ j ] + sum [ i ] [ j + 1 ] - sum [ i ] [ j ] + w [ i ] [ j ]
                sum_x [ i + 1 ] [ j + 1 ] = sum_x [ i + 1 ] [ j ] + sum_x [ i ] [ j ] - sum_y [ i ] [ j ] + sum_y [ i ] [ j + 1 ] - sum_y [ i ] [ j