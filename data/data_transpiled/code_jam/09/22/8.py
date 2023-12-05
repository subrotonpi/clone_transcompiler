def _ ( ) :
    import os
    import sys
    import string
    class Gcjr1p2 ( ) :
        def __init__ ( self ) :
            try :
                f = open ( 'B-large.in' , 'r' )
                f = open ( 'result.txt' , 'w' )
                s = f.read ( )
                T = int ( s )
                for i in range ( 1 , T + 1 ) :
                    res = f.read ( )
                    chrs = res [ : ]
                    lst = [ ]
                    ok = False
                    for j in range ( len ( res ) - 1 , 0 , - 1 ) :
                        chr1 , chr2 = res [ j ] , res [ j - 1 ]
                        lst.append ( chr1 - '0' )
                        if chr1 > chr2 :
                            lst = [ ]
                            k = 0
                            for val in lst :
                                lst.append ( val )
                                k += 1
                            lst.sort ( )
                            choosen = - 1
                            for k in lst :
                                if k > chr2 - '0' :
                                    choosen = k
                                    break
                            chrs.append ( chr ( lst [ choosen ] + '0' ) )
                            lst.append ( chr2 - '0' )
                            lst.sort ( )
                            for k in lst :
                                chrs.append ( chr ( lst [ k ] + '0' ) )
                        ok = True
                        break
                if ok :
                    f.write ( 'Case #%d: %s\n' % ( i , ''.join ( chrs ) ) )
                else :
                    lst.append ( res [ 0 ] - '0' )
                    lst = [ ]
                    k = 0
                    for val in lst :
                        lst.append ( val )
                        k += 1
                    lst.sort ( )
                    choosen = - 1
                    for k in lst :
                        if k > 0 :
                            choosen = k
                            break
                    chrs = [ chr ( lst [ k ] + '0' ) ] + chrs [ k + 1 : ]
            f.close ( )
    return
