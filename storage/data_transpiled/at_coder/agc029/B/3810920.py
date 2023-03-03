def left ( x ) :
    from collections import defaultdict
    def left ( x ) :
        i = 1
        while i <= x :
            i <<= 1
        return i - x
    def main ( ) :
        sc = open ( "/proc/test/" , "r" )
        n = sc.read ( )
        a = [ ]
        used = [ ]
        cnt = defaultdict ( int )
        for i in range ( n ) :
            a.append ( sc.read ( ) )
            used.append ( 0 )
            if cnt.has_key ( a [ i ] ) :
                cnt [ a [ i ] ] = cnt [ a [ i ] ] + 1
            else :
                cnt [ a [ i ] ] = 1
        a.sort ( )
        ans = 0
        for i in range ( n - 1 , - 1 , - 1 ) :
            x = a [ i ]
            if cnt [ x ] == 0 :
                continue
            cnt [ x ] = cnt [ x ] - 1
            match = left ( x )
            if match in cnt and cnt [ match ] > 0 :
                ans += 1
                cnt [ match ] = cnt [ match ] - 1
        print ( ans )
    return main
