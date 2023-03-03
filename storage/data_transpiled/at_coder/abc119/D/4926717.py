def _import ( ) :
    from math import sin , cos , abs
    from numpy import linspace , sin , cos
    class Main ( object ) :
        def __init__ ( self ) :
            with open ( "/proc/" , "rb" ) as f :
                a , b , q = [ int ( x ) for x in f.readlines ( ) ]
                s = [ ]
                sin ( a )
                s.append ( sin ( a ) )
                t = [ ]
                sin ( b )
                t.append ( sin ( b ) )
                result = [ ]
                sin ( q )
                x = linspace ( x , x , a )
                result.append ( nearest ( x , s , t ) )
                [ sin ( x ) for x in result ]
        def _nearest ( x , s , t ) :
            s1 , s2 , t1 , t2 = [ s [ i ] for i in t ]
            sIndex = bisect.bisect_left ( s , x )
            tIndex = bisect.bisect_right ( t , x )
            if sIndex >= 0 :
                s1 = s2 = s [ sIndex ]
            else :
                if sIndex == - 1 :
                    s1 = s2 = s [ 0 ]
                elif sIndex == - len ( s ) - 1 :
                    s1 = s2 = s [ - 1 ]
                else :
                    s1 = s [ - sIndex - 2 ]
                    s2 = s [ - sIndex - 1 ]
            if tIndex >= 0 :
                t1 = t2 = t [ tIndex ]
            else :
                if tIndex == - 1 :
                    t1 = t2 = t [ 0 ]
                elif tIndex == - len ( t ) - 1 :
                    t1 = t2 = t [ - 1 ]
                else :
                    t1 = t [ - tIndex - 2 ]
                    t2 = t [ - tIndex - 1 ]
            return min ( distance ( x , s1 , t1 ) , distance ( x , s1 , t2 ) , distance ( x , s2 , t1 ) , distance ( x , s2 , t2 ) )
    return Main
