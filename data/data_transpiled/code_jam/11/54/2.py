def _ ( ) : return
import math
import io
import string
import string
import string
import string
import string
import string
import string
import string
import string
def go ( pos , have ) :
    if pos == len ( s ) :
        x = int ( round ( math.sqrt ( have ) ) )
        if x * x == have :
            res = string.join ( c , '' )
        return
    if s [ pos ] == '0' :
        c [ pos ] = '0'
        go ( pos + 1 , 2 * have )
    elif s [ pos ] == '1' :
        c [ pos ] = '1'
        go ( pos + 1 , 2 * have + 1 )
    else :
        c [ pos ] = '0'
        go ( pos + 1 , 2 * have )
        c [ pos ] = '1'
        go ( pos + 1 , 2 * have + 1 )
def go ( ) :
    with open ( 'input.txt' , 'r' ) as sc :
        with open ( 'output.txt' , 'w' ) as pw :
            casecnt = sc.read ( )
            for casenum in range ( 1 , casecnt + 1 ) :
                print ( 'Processing case ' , casenum )
                pw.write ( 'Case #' + str ( casenum ) + ': ' )
                s = sc.read ( )
                c = string.join ( c , '' )
                go ( 0 , 0 )
                pw.write ( res )
            pw.flush ( )
            pw.close ( )
            sc.close ( )
