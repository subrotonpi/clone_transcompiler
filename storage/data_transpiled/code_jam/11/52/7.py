def _11R3 ( ) :
    import os
    import sys
    import math
    import math
    import math
    import math
    import math
    import math
    import math
    import math
    import numpy
    import math
    import numpy
    import numpy
    import collections
    class ProgramB ( object ) :
        _PRACTICE = not True
        _SAMPLE = not True
        _SMALL = not True
        _PROBLEM = 'B'
        def debug ( * os ) :
            print ( "failed at line %d" % ( j ) )
            print ( "expected %s" % ( s2 ) )
            break
    def run ( ) :
        with open ( _SMALLNAME ( i ) + ".in" , "r" ) as f :
            with open ( _SMALLNAME ( i ) + ".out" , "r" ) as f :
                for j in range ( 1 , oo + 1 ) :
                    print ( f.read ( ) , end = "" )
                    print ( f.read ( ) , file = f )
    def solve ( ) :
        n = len ( f.read ( ) )
        is = [ 0 for i in range ( 10010 ) ]
        if n == 0 :
            print ( 0 )
            return
        left , right = 1 , n + 1
        while True :
            mid = ( left + right ) // 2
            if can ( mid , is [ : n ] ) :
                left = mid
            else :
                right = mid
        print ( left )
    def can ( mid , is , n ) :
        last = [ ]
        for i in range ( 1 , 10005 ) :
            if is [ i ] > last [ i - 1 ] :
                last [ i ] += last [ i - 1 ]
                is [ i ] -= last [ i - 1 ]
                c = is [ i ]
                for j in range ( mid ) :
                    if is [ i + j ] < c :
                        return False
                    is [ i + j ] -= c
                last [ i + mid - 1 ] += c
            else :
                last [ i ] += is [ i ]
                is [ i ] = 0
        return True
    return run
