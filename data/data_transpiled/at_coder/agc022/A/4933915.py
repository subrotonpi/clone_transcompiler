def import sys , out
import string
import sys
import string
import string
import sys
try :
    sc = string.Scanner ( )
    S = sc.next ( )
    exists = [ 'z' - 'a' + 1 ]
    for c in S :
        exists [ c - 'a' ] = 1
    if len ( S ) < 26 :
        out.write ( S )
        for i in range ( 0 , 'z' - 'a' ) :
            if not exists [ i ] :
                out.write ( chr ( ord ( 'a' ) + i ) )
                return
    else :
        cand = [ ]
        for i in range ( len ( S ) - 1 , 0 , - 1 ) :
            change_char = S [ i ]
            loop :
            for k in range ( i - 1 , - 1 , - 1 ) :
                if S [ k ] < change_char :
                    str = [ ]
                    for j , c in enumerate ( S ) :
                        if j == k :
                            str.append ( change_char )
                            cand.append ( ''.join ( str ) )
                            break loop
                        else :
                            str.append ( c )
        if not cand :
            out.write ( - 1 )
        else :
            out.write ( cand.pop ( ) )
