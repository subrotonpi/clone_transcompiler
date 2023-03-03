def walk ( aa , k ) :
    import os
    import sys
    from itertools import chain
    from itertools import chain
    def walk ( aa , k ) :
        n = 0
        for i in chain ( aa , i ) :
            n = n * k + i
        return n + 1
    def main ( ) :
        f = open ( 'input.txt' , 'r' )
        f.write ( '\n' )
        T = sum ( map ( len , f.readlines ( ) ) )
        for t in range ( 1 , T + 1 ) :
            line = f.readline ( ).split ( )
            k , c , s = map ( len , line )
            s = [ 'Case #%d:' % t ]
            if k > c * s :
                s.append ( 'IMPOSSIBLE' )
            else :
                aa = [ ]
                for i , d in enumerate ( zip ( range ( c ) , range ( s ) ) ) :
                    if d == k : break
                    for j in range ( c ) :
                        aa.append ( d )
                s.append ( ' '.join ( chain ( * aa ) ) )
            f.write ( '\n'.join ( s ) )
    return main
