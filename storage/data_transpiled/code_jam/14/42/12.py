def gcj ( R2_2014 ) :
    import os
    import sys
    import os
    import sys
    import time
    import sys
    import os.path
    import sys
    import time
    import sys
    import os.path
    import sys
    import time
    import gc
    def tr ( * x ) :
        print ( "".join ( x ) , end = time.time ( ) )
        return ""
    def main ( ) :
        start = time.time ( )
        pkg = { }.get ( 'pkg' , '' )
        filename = ''
        if True :
            filename = 'B-large.in'
        with open ( '%s/%s' % ( dir , filename ) , 'w' ) as sc :
            obj = GCJ ( )
            TNO = len ( sc )
            for tno in range ( TNO ) :
                fout.write ( 'Case #%d: ' % ( tno + 1 ) )
                obj.solve ( sc , fout )
                fout.flush ( )
            fout.flush ( )
        end = time.time ( )
        tr ( '%dms' % ( end - start ) )
    def solve ( sc , fout ) :
        N = len ( sc )
        a = [ sc.next ( ) for sc in sc ]
        a = normalize ( a )
        pos = [ i for i in range ( N ) ]
        res = 0
        for i in range ( N ) :
            left , right = 0 , 0
            for j in pos [ i - 1 ] :
                if a [ j ] > i :
                    left += 1
                for j in range ( i + 1 , N ) :
                    if a [ j ] > i :
                        right += 1
            cur = min ( left , right )
            res += cur
        return res
    return solve
