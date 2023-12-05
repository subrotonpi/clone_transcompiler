def import _reader
import sys
class c ( object ) :
    def __init__ ( self ) :
        self.input = sys.stdin
        self.stdout = open ( 'c1.out' , 'w' )
    def __init__ ( self ) :
        self.input = open ( '' )
        self.input = iter ( self.input )
        self.next = iter ( self.input )
    def __next__ ( self ) :
        return int ( self.next )
    def nextDouble ( self ) :
        return float ( self.next )
    def next ( self ) :
        return long ( self.next )
    def lo , hi = 0 , 2000
    for iter in range ( 60 ) :
        mid = ( lo + hi ) / 2
        mid2 = mid ** 2
        ds = DisjointSet ( n )
        for i in range ( n ) :
            for j in range ( i + 1 , n ) :
                d2 = ( xs [ i ] - xs [ j ] ) ** 2 + ( ys [ i ] - ys [ j ] ) ** 2 + ( zs [ i ] - zs [ j ] ) ** 2
                if d2 <= mid2 :
                    ds.union ( i , j )
            if ds.find ( 0 ) == ds.find ( 1 ) :
                hi = mid
            else :
                lo = mid
        print ( 'Case #%d: %d' % ( self.t + 1 , hi ) , end = ' ' )
class DisjointSet ( object ) :
    def __init__ ( self ) :
        self.map = { }
        [ self.map [ - 1 ] ] = self.find ( 0 )
    def union ( self , a ) :
        self.map [ - 1 ] = self.map [ - 1 ]
    def union ( self , b ) :
        self.map [ - 1 ] = self.map [ - 1 ]
return c
