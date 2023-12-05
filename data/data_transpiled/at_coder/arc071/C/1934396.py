def _import ( ) :
    import sys
    import string
    class Main ( object ) :
        def prep ( s ) :
            s_pre = [ ]
            for i in range ( 1 , len ( s ) + 1 ) :
                c = s [ i - 1 ]
                if c == 'A' :
                    s_pre.append ( s_pre [ i - 1 ] + 1 )
                else :
                    s_pre.append ( s_pre [ i - 1 ] + 2 )
            return s_pre
        def main ( ) :
            f = sys.stdin
            s = f.readline ( )
            t = f.readline ( )
            s_pre = prep ( s )
            t_pre = prep ( t )
            q = int ( f.readline ( ) )
            for i in range ( q ) :
                line = f.readline ( ).split ( )
                a , b , c , d = [ int ( x ) for x in line ]
                if ( s_pre [ b ] - s_pre [ a - 1 ] ) % 3 == ( t_pre [ d ] - t_pre [ c - 1 ] ) % 3 :
                    print ( "YES" )
                else :
                    print ( "NO" )
