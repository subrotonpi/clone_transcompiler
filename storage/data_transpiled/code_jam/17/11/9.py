def gcj2017.a1.a ( ) :
    import os
    import sys
    import os
    import sys
    import os.path
    import sys
    import time
    class GCJ ( object ) :
        def tr ( * x ) :
            sys.stderr.write ( ''.join ( x ) + '\n' )
    def main ( ) :
        start = time.time ( )
        pkg = eval ( 'g' )
        dir = os.path.join ( 'src' , pkg )
        filename = ''
        if True :
            filename = 'A-large.in'
        with open ( '%s/%s' % ( dir , filename ) , 'w' ) as sc :
            obj = GCJ ( )
            T = sc.count ( )
            for t in range ( T ) :
                fout.write ( 'Case #%d:\n' % ( t + 1 ) )
                obj.solve ( sc , fout )
                fout.flush ( )
            fout.flush ( )
        end = time.time ( )
        tr ( '%dms' % ( end - start ) )
    def solve ( sc , out ) :
        R = sc.count ( )
        C = sc.count ( )
        tr ( R , C )
        s = [ ]
        for r in range ( R ) :
            cur = '?'
            for c in range ( C ) :
                if s [ r ] [ c ] == '?' :
                    s [ r ].append ( cur )
                else :
                    cur = s [ r ] [ c ]
            for c in range ( C - 1 ) :
                if s [ r ] [ c ] == '?' :
                    s [ r ].append ( cur )
                else :
                    cur = s [ r ] [ c ]
            for c in range ( C ) :
                if s [ r ] [ c ] == '?' :
                    s [ r ].append ( cur )
                else :
                    cur = s [ r ] [ c ]
        return s
    return solve
