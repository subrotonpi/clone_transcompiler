def import readline
import sys
import random
import sys
import random
import sys
import sys
import random
import sys
INFINITY = 100
def solve ( ) :
    n , m = randint ( 0 , sys.maxint )
    a = [ ]
    for i in range ( n ) :
        try :
            line = readline ( )
            if not line : return None
            St = [ [ i , j ] for j in range ( m ) ]
        except :
            NOO ( sys.exc_info ( ) [ 1 ] )
    return St
def main ( ) :
    with open ( '%s.in' % name , 'r' ) as f :
        with open ( '%s.out' % name , 'w' ) as f :
            f.write ( '' )
    changed = [ ]
    while True :
        min_value , min_value_x , min_value_y = INFINITY , - 1 , - 1
        for x in range ( n ) :
            for y in range ( m ) :
                if not changed [ x ] [ y ] and a [ x ] [ y ] < min_value :
                    min_value , min_value_x , min_value_y = a [ x ] [ y ] , min_value
        if min_value == INFINITY :
            break
        can_change = True
        for x in range ( n ) :
            if not changed [ x ] [ min_value_y ] and a [ x ] [ min_value_y ] != min_value :
                can_change = False
        if can_change :
            for x in range ( n ) :
                changed [ x ] [ min_value_y ] = True
            continue
        can_change = True
        for y in range ( m ) :
            if not changed [ x ] [ y ] and a [ x ] [ y ] != min_value :
                can_change = False
        if can_change :
            for y in range ( m ) :
                changed [ x ] [ y ] = True
            continue
        f.write ( 'NO\n' )
        return
    f.write ( 'YES\n' )
def solve ( ) :
    try :
        tc = randint ( 0 , sys.maxint )
        for it in range ( 1 , tc + 1 ) :
            sys.stderr.write ( it )
            