def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.readline ( ).strip ( ) )
        self.maxw = int ( sys.stdin.readline ( ).strip ( ) )
        sina = [ ]
        for i in range ( 4 ) :
            sina.append ( Sina ( ) )
        w1 = sys.stdin.readline ( ).strip ( )
        v1 = sys.stdin.readline ( ).strip ( )
        sina [ 0 ].vs.append ( v1 )
        for i in range ( 1 , n ) :
            sina [ int ( sys.stdin.readline ( ).strip ( ) ) ].vs.append ( sys.stdin.readline ( ).strip ( ) )
        for i in range ( 4 ) :
            sina [ i ].vs.sort ( lambda x , y : y - x )
            sina [ i ].sums = [ 0 ]
            j = 1
            for v in sina [ i ].vs :
                sina [ i ].sums [ j ] = sina [ i ].sums [ j - 1 ] + v
                j += 1
        ans = 0
        for a in range ( 0 , len ( sina [ 0 ].vs ) ) :
            for b in range ( 0 , len ( sina [ 1 ].vs ) ) :
                for c in range ( 0 , len ( sina [ 2 ].vs ) ) :
                    for d in range ( 0 , len ( sina [ 3 ].vs ) ) :
                        if maxw < ( w1 * a + ( w1 + 1 ) * b + ( w1 + 2 ) * c + ( w1 + 3 ) * d ) :
                            break
                        ans = max ( ans , sina [ 0 ].sums [ a ] + sina [ 1 ].sums [ b ] + sina [ 2 ].sums [ c ] + sina [ 3 ].sums [ d ] )
        print ( ans )
    class Sina ( object ) :
        def __init__ ( self ) :
            self.vs = [ ]
            self.sums = [ ]
