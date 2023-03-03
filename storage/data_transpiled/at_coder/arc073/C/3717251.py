def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( ).strip ( )
        a = [ ]
        min , max = sys.maxint , sys.maxint
        for i in range ( n ) :
            x , y = sc.readline ( ).strip ( ).split ( ' ' )
            if x > y :
                z = x , y , z
            a.append ( [ x , y ] )
            min , max = min , max
        res = 0
        mima , mami = min , max
        for i in range ( n ) :
            mima = max ( mima , a [ i ] )
            mami = min ( mami , a [ i ] )
        res = - long ( mima - min ) * ( mami - max )
        a.sort ( key = lambda x : x [ 0 ] - y [ 0 ] )
        b = [ ]
        for i in range ( n ) :
            b.append ( a [ i ] [ 0 ] )
        b.sort ( key = lambda x : x [ 1 ] )
        suf = [ ]
        te = sys.maxint
        for i in range ( n - 1 , - 1 , - 1 ) :
            te = min ( te , b [ i ] )
            suf.append ( te )
        kmin , kmax = sys.maxint , sys.maxint
        diff = sys.maxint
        for i in range ( n ) :
            kmin , kmax = min ( kmin , a [ i ] )
            smin , smax = suf [ i + 1 ]
            smin = min ( smin , kmax )
            smax = max ( smax , suf [ i ] )
            diff = min ( diff , smin )
        res = min ( res , diff * ( max - min ) )
        print ( res )
