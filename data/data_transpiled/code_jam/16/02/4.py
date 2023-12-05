def main ( ) :
    import os
    import sys
    from numpy.distutils.misc_util import get_sample_file
    with open ( 'src/B-large.in' , 'r' ) as sc :
        output = ""
        t = sc.readline ( ).strip ( )
        sc.readline ( )
        for i in range ( 1 , t + 1 ) :
            s = sc.readline ( )
            count = 0
            track = s [ 0 ]
            for c in s :
                if track != c :
                    track = c
                    count += 1
            if track == '-' :
                count += 1
            output += "Case #%d: %d\n" % ( i , count )
        f = open ( 'src/B-large.out' , 'w' , encoding = 'utf-8' )
        f.write ( output )
        f.close ( )
