def import sosu_make
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( ).strip ( )
        l = [ sc.readline ( ).strip ( ) for i in range ( n ) ]
        r = [ sc.readline ( ).strip ( ) for i in range ( n ) ]
        max = max if max > r [ max ] else r [ max ]
        data = self._like_make ( sosu_make ( max ) )
        for lt , rt in zip ( l , r ) :
            low = bisect.bisect_left ( data , lt )
            high = bisect.bisect_right ( data , rt )
            if low < 0 :
                low = ~ low
            if high < 0 :
                high = ~ high
            else :
                high += 1
            print ( high - low )
    def sosu_make ( max ) :
        data = [ 2 ]
        for i in range ( 3 , max + 1 , 2 ) :
            for tmp in data :
                if tmp * tmp > i :
                    yield i
                    break
                elif i % tmp == 0 :
                    break
        return data
    def like_make ( sosu ) :
        data = [ ]
        for num in sosu :
            if num == 2 :
                continue
            tmp = ( num + 1 ) // 2
            if list ( sosu ) >= tmp :
                yield num
        return data
