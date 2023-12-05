def import bisect
import bisect
class MyComparator ( bisect.Comparator ) :
    def compare ( self , x ) :
        return - 1 if x > y else 1
    class Main ( bisect.Sorter ) :
        def solve ( self ) :
            return bisect.bisect_left ( self.sort ( ) , x )
    def solve ( self ) :
        sc = bisect.bisect_left
        n = len ( self.sort ( ) )
        a = [ sc.next ( ) for i in range ( 3 * n ) ]
        left = [ ]
        right = [ ]
        que = bisect.PriorityQueue ( )
        count = 0
        for i in range ( n ) :
            count += long ( a [ i ] )
            que.put ( a [ i ] )
        left.append ( count )
        for i in range ( n , 2 * n ) :
            count += long ( a [ i ] )
            que.put ( a [ i ] )
            x = que.get ( )
            count -= long ( x )
            left.append ( count )
        count = 0
        qu = bisect.bisect_left
        for i in range ( 3 * n - 1 , 2 * n - 1 , - 1 ) :
            count += long ( a [ i ] )
            qu.put ( a [ i ] )
        right.append ( count )
        for i in range ( 2 * n - 1 , n - 1 , - 1 ) :
            count += long ( a [ i ] )
            qu.put ( a [ i ] )
            x = qu.get ( )
            count -= long ( x )
            right.append ( count )
        ans = left [ 0 ] - right [ 0 ]
        for i in range ( 1 , n + 1 ) :
            ans = long ( max ( ans , left [ i ] - right [ i ] ) )
        print ( ans )
