def main ( ) :
    import os
    import sys
    from numpy.distutils.misc_util import get_data_filename
    with open ( 'src/A-large.in' , 'r' ) as sc :
        output = ""
        t = sc.randint ( 1 , 10 )
        for i in range ( 1 , t + 1 ) :
            n = sc.randint ( 1 , 10 )
            if n == 0 :
                output += "Case #%d: INSOMNIA\n" % i
                continue
            seen = [ False ] * 10
            num = 0
            count = 0
            while count < 10 :
                num += n
                for c in ( "%d" % num ) :
                    d = c - '0'
                    if not seen [ d ] :
                        seen [ d ] = True
                        count += 1
            output += "Case #%d: %d\n" % ( i , num )
        f = open ( 'src/A-large.out' , 'w' , encoding = 'utf-8' )
        f.write ( output )
        f.close ( )
