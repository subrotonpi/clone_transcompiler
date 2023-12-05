def import _help
import sys
import string
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = string.ascii_lowercase
        s = sc.decode ( 'utf-8' )
        f = sys.stdout
        f.write ( help ( s ) )
        f.flush ( )
    def help ( s ) :
        if s == 'zyxwvutsrqponmlkjihgfedcba' : return '-1'
        a = s.decode ( 'utf-8' )
        rec = [ - 1 ] * 26
        for i in range ( len ( a ) ) :
            rec [ a [ i ] - 'a' ] = i
        if len ( a ) < 26 :
            for i in range ( 26 ) :
                if rec [ i ] == - 1 :
                    return s + string.digits [ ord ( i ) + 'a' ]
            return '-1'
        else :
            for start in range ( 24 , - 1 , - 1 ) :
                if a [ start ] == 'z' : continue
                cur = a [ start ]
                for i in range ( cur - 'a' + 1 , 26 ) :
                    if rec [ i ] > start :
                        return s [ : start ] + string.digits [ ord ( i ) + 'a' ]
            return '-1'
