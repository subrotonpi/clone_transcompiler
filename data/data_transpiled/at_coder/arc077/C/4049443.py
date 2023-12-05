def import _main
class Main ( object ) :
    def __init__ ( self , res ) :
        sc = _main ( )
        n = sc.__next__ ( )
        m = sc.__next__ ( )
        a = [ sc.__next__ ( ) for i in range ( n ) ]
        hai = [ ]
        size = 0
        for i in range ( n ) :
            j = i + 1
            while ( j < n ) and ( a [ j ] > a [ j - 1 ] ) :
                j += 1
            j -= 1
            hai.append ( [ ] )
            for k in range ( i , j + 1 ) :
                hai [ size ].append ( a [ k ] )
            i = j
            size += 1
        hai = [ ]
        pref = [ ]
        pref.append ( [ ] )
        for i in range ( a [ 0 ] ) :
            pref [ i ] -= 1
        for i in range ( a [ n - 1 ] + 1 , m ) :
            pref [ i ] -= 1
        for i in range ( 1 , n ) :
            dist = ( a [ i ] - a [ i - 1 ] + m ) % m
            if a [ i ] == m :
                continue
            pref [ a [ i ] ] -= dist
        sum = [ ]
        t = 0
        max = 0
        ind = 0
        for i in range ( m ) :
            t += pref [ i ]
            if t > max :
                max = t
                ind = i
        res = 0
        cur = a [ 0 ]
        for i in range ( 1 , n ) :
            if a [ i ] > cur :
                if ( cur < ( ind + 1 ) ) and ( ( ind + 1 ) <= a [ i ] ) :
                    res += a [ i ] - cur - ( ind - cur )
                else :
                    res += a [ i ] - cur
            else :
                res += dist2 - dist + 1
        return res
