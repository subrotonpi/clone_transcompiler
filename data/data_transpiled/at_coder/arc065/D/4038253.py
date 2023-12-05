def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n , self.m = sys.stdin.readline ( ).split ( )
        mod = 1000000007
        dp = [ [ 1 ] * n + [ 0 ] ]
        dp [ 0 ] [ 0 ] = 1
        data = self.data + '1'
        ind , ri = 0 , 0
        zs = 0
        for i in range ( 0 , m ) :
            l , r = ( i , n ) - 1 , ( i , n ) - 1
            while ind < l :
                for j in range ( 0 , ind ) :
                    if ( ind == ri and data [ ri ] == '0' ) :
                        ri += 1
                    zs += 1
                    if ( j + 1 ) <= zs :
                        dp [ ind + 1 ] [ j + 1 ] = dp [ ind ] [ j ]
                    if ( ind + 1 - j ) <= ( ri - zs ) :
                        dp [ ind + 1 ] [ j ] = ( dp [ ind + 1 ] [ j ] + dp [ ind ] [ j ] ) % mod
                ind += 1
            while ri <= r :
                if data [ ri ] == '0' :
                    ri += 1
        print ( dp [ n ] [ zs ] )
