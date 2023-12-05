def _main ( * args ) :
    import sys
    import os
    import math
    import numpy
    import numpy
    import numpy.random
    import collections
    class B :
        _PRACTICE = not True
        _SAMPLE = not True
        _SMALL = not True
        _PROBLEM = 'B'
        def debug ( * os ) :
            print ( 'failed at line %d' % j )
            print ( 'expected %s' % s1 )
            break
    else :
        sys.stdin = open ( _SMALLNAME ( ) + '.stdin' , 'r' )
        sys.stdout = open ( _SMALLNAME ( ) + '.stdout' , 'w' )
        br1 = br1.readlines ( )
        br2 = br2.readlines ( )
        for j in range ( 1 , oo ) :
            s1 = br1 [ j ]
            s2 = br2 [ j ]
            if s1 is None and s2 is None or not s1 == s2 :
                print ( 'failed at line %d' % j )
                print ( 'but %s' % s1 )
                break
    if not _PROBLEM :
        print ( '--large' , _PROBLEM ( ) )
    def run ( ) :
        sc = open ( _SMALLNAME ( ) + '.stdin' , 'r' )
        oo = sc.read ( 1 )
        for o in range ( 1 , oo + 1 ) :
            print ( o )
            print ( 'Case #%d: ' % o )
        L = 256
        dp = [ [ ] for _ in range ( 2 ) ]
        D , I , M , N = sc.read ( )
        as = [ ]
        for i in range ( N ) :
            as.append ( sc.read ( ) )
        if D == 0 or ( I == 0 and M > 0 ) :
            print ( 0 )
            continue
        for i in range ( N ) :
            cur , nxt = i % 2 , ( i + 1 ) % 2
            fill ( dp [ nxt ] , 1 << 28 )
            for j in range ( L ) :
                dp [ nxt ] [ j ] = min ( dp [ nxt ] [ j ] , dp [ cur ] [ j