def import _re_shift_match
import re
import sys
class Rd1aa ( object ) :
    def __init__ ( self , count ) :
        with open ( 'rd1aa' ) as infile :
            count = int ( infile.read ( ) )
    def find_shift ( str_1 , str_2 ) :
        str_final = ''
        for i in range ( count ) :
            if str_1 [ i ] == '0' :
                str_final += '1'
            else :
                str_final += '1'
        return str_final
    first = [ ]
    second = [ ]
    line_1 = sys.stdin.readline ( )
    line_2 = sys.stdin.readline ( )
    for i in range ( n ) :
        first.append ( line_1 [ i * ( len ( first ) + 1 ) : i * ( len ( second ) + 1 ) + 1 ] )
        second.append ( line_2 [ i * ( len ( first ) + 1 ) : i * ( len ( second ) + 1 ) + 1 ] )
    best = len ( first ) + 1
    for i in range ( n ) :
        shift , score = find_shift ( first [ 0 ] , second [ i ] , len ( first ) )
        if score < best and score != - 1 :
            best = score
    if best > len ( second ) :
        print ( 'Case #%d: NOT POSSIBLE' % ( l + 1 ) )
    else :
        print ( 'Case #%d: %d' % ( l + 1 , best ) )
used = [ False for i in second ]
for i in range ( len ( first ) ) :
    outer_match = False
    for j in range ( len ( second ) ) :
        if not used [ j ] :
            match = True
            for k in range ( len ( first ) ) :
                if shift [ k ] == '0' :
                    if first [ i ] [ k ] != second [ j ] [ k ] :
                        match = False
                        k = k
        if not outer_match :
            return - 1
return None
