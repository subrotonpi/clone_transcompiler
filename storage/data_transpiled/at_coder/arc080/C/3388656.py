def _import ( ) : return _import ( )
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.idx = [ ]
        self.A = [ ]
        self.even = [ ]
        self.odd = [ ]
        self.all = [ ]
    def main ( self ) :
        f = open ( self.infile )
        while f.read ( ) != "" :
            f.readline ( )
    def update ( self , val ) :
        self.idx += [ val ]
    def find ( a , b , left , right ) :
        if b <= left or a <= right : return [ ]
        v1 = query ( a , b , left , ( left + right ) / 2 )
        v2 = query ( a , b , 2 * k + 1 , right )
        return min ( v1 , v2 )
class mycmp ( Comparator ) :
    def compare ( self , o1 , o2 ) :
        dic = [ o1 , o2 ]
        res = [ ]
        for i in range ( 2 ) :
            cur = self.dic [ i ]
            left = cur [ 0 ]
            right = self.even.find ( left / 2 , right / 2 )
            for i in range ( 0 , n , 2 ) :
                even.update ( i / 2 , A [ i ] )
            for i in range ( 1 , n , 2 ) :
                odd.update ( i / 2 , A [ i ] )
mc = mycmp ( )
pq = PriorityQueue ( 10 , mc )
pq.add ( [ 0 , n ] )
lines = [ ]
for i in range ( 1 , n , 2 ) :
    cur = pq.get ( )
    left = cur [ 0 ]
    right = cur [ 1 ]
    if left % 2 == 0 :
        now = even.find ( left / 2 , right / 2 )
        next = odd.find ( ( idx [ now ] + 1 ) / 2 , ( right + 1 ) / 2 )
    else :
        now = odd.find ( left / 2 , right / 2 )
        next = even.find ( ( idx [ now ] + 1 ) / 2 , ( right + 1 ) / 2 )
    lines.append ( now )
    lines.append (