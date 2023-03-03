def main ( ) :
    import os
    from random import randint
    from bai2 import bai2
    from bai2 import bai2
    with open ( 'B-large.in' , 'r' ) as sc :
        with open ( 'Blarge.out' , 'w' ) as pw :
            p = [ 1 ] * 12
            for i in range ( 1 , len ( p ) ) :
                p [ i ] = randint ( 0 , 28 ) * p [ i - 1 ]
        if best < z :
            best = z
            jbest = j
        res = res + '' + ''.join ( words [ jbest ] )
        for test in range ( 1 , ntest + 1 ) :
            print ( 'Running test ' + str ( test ) , file = sys.stderr )
            n , m = select ( [ 0 ] , [ ] )
            words = [ sc.next ( ).split ( '' ) for i in range ( n ) ]
            have = [ [ True ] * 256 for i in range ( n ) ]
            for i in range ( m ) :
                for j in range ( 1 , len ( words [ i ] ) ) :
                    have [ i ] [ words [ i ] [ j ] ] = True
            res = ''
            for i in range ( m ) :
                order = ( '' + str ( sc.next ( ) ).split ( '' ) )
                pos = [ j for j in range ( 1 , len ( order ) ) ]
                ts = [ [ ] for t in range ( 27 ) ]
                for j in range ( n ) :
                    cur = p [ j ] - 1
                    if have [ j ] [ order [ 1 ] ] :
                        ts [ 0 ].append ( cur )
                    for k in range ( 1 , 26 ) :
                        if have [ j ] [ order [ k ] ] :
                            for t in range ( len ( words [ j ] ) ) :
                                if words [ j ] [ t ] == order [ k ] :
                                    ts [ j ].append ( cur )
