def _ _ main _ _ ( ) :
    import sys
    import math
    import string
    import string
    import string
    import string
    import string
    import string
    import string
    import string
    import string
    import string
    import string
    import string
    import string
    import string
    import string
    import int
    import string
    import string
    import string
    infile = 'input.txt'
    infile = 'B-small-attempt0.in'
    sc = open ( infile , 'r' )
    fw = open ( 'output.txt' , 'w' , 'w' )
    N = sc.__next__ ( )
    for cas in range ( 1 , N + 1 ) :
        fw.write ( 'Case #%d: ' % cas )
        res = string.split ( '+' ) [ 0 ]
        p = [ ]
        T = len ( t )
        for i in range ( T ) :
            for j in range ( len ( t [ i ] ) ) :
                p [ i ] [ t [ i ] [ j ] - 'a' ] += 1
        n = sc.__next__ ( )
        w = [ ]
        ww = [ ]
        for i in range ( n ) :
            w.append ( sc.__next__ ( ) )
            for j in range ( len ( w [ i ] ) ) :
                ww [ i ] [ w [ i ] [ j ] - 'a' ] += 1
        for d in range ( 1 , k + 1 ) :
            res = 0
            D = int ( pow ( n , d ) )
            for i in range ( D ) :
                res1 = 0
                z = i
                num = [ ]
                for j in range ( d ) :
                    num.append ( z % n )
                    z /= n
                res1 = ( res1 + r1 ) % mod
            res = ( res + res1 ) % mod
        fw.write ( '' * ( N - len ( t ) ) )
        return ''
