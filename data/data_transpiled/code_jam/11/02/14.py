def _import ( ) :
    import os
    import sys
    import os
    import sys
    import os
    import sys
    import itertools
    class B ( ) :
        def ops ( e , op , cnt ) :
            for i in range ( len ( op [ e ] ) ) :
                if op [ e ] [ i ] and cnt [ i ] :
                    return True
            return False
        def main ( ) :
            b = B ( )
            try :
                b.parse_file ( 'B-large' )
            except IOError :
                pass
    def solve ( cb , op , seq ) :
        N = len ( seq )
        ret = [ ]
        idx = 0
        cnt = [ ]
        for i in range ( 1 , N ) :
            ret.append ( seq [ i ] )
            cnt.append ( seq [ i ] )
            idx += 1
            while idx >= 2 :
                e1 = ret [ idx - 1 ]
                e2 = ret [ idx - 2 ]
                if cb [ e1 ] [ e2 ] > 0 :
                    idx -= 2
                    ret.append ( cb [ e1 ] [ e2 ] - 1 )
                    cnt [ e1 ] -= 1
                    cnt [ e2 ] -= 1
                    cnt [ ret [ idx ] ] += 1
                    idx += 1
                elif ops ( e1 , op , cnt ) :
                    [ cnt ] = 0
                    idx = 0
                else :
                    break
        if idx == 0 :
            return '[]\n'
        else :
            s = '['
            c = chr ( ret [ 0 ] ) + 'A'
            s += c
            for i in range ( 1 , idx ) :
                c = chr ( ret [ i ] ) + 'A'
                s += c
            s += ']\n'
            return ''.join ( s )
    def run_input ( f ) :
        items = f.strip ( ).split ( 's+' )
        idx = 0
        C = int ( items [ idx ] )
        idx = 0
        for i in range ( 1 , len ( items ) ) :
            e1 = items [ idx ] [ 1 ] - 'A'
            cb [ e1 ] [ e2 ] = True
            idx += 1
        return solve ( cb , op , seq )
    return solve
