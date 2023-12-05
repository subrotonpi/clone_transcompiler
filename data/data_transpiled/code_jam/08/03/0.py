def import _pylab
class C ( object ) :
    def __init__ ( self ) :
        sc = _pylab
        for id in range ( 1 , N + 1 ) :
            f = sc.get ( 'f' )
            R = sc.get ( 'R' )
            t = sc.get ( 't' )
            r = sc.get ( 'r' )
            g = sc.get ( 'g' )
            if g - 2 * f <= 0.0 :
                ans = 1.0
            elif R - t - f <= 0.0 :
                ans = 1.0
            else :
                all = math.pi * R ** 2 / 4.0
                miss = 0.0
                for y in range ( 0 , ( g + 2.0 * r ) * y + ( r + f ) ) :
                    for x in range ( 0 , ( g + 2.0 * r ) * x + ( r + f ) ) :
                        x1 = ( g + 2.0 * r ) * x + ( r + f )
                        x2 = ( g + 2.0 * r ) * x + ( r + g - f )
                        y1 = ( g + 2.0 * r ) * y + ( r + f )
                        y2 = ( g + 2.0 * r ) * y + ( r + g - f )
                        if x1 * x1 + y1 * y1 > ( R - t - f ) ** 2 :
                            pass
                        elif x2 * x2 + y2 * y2 < ( R - t - f ) ** 2 :
                            miss += ( y2 - y1 ) * ( x2 - x1 )
                        else :
                            d = ( 1 << 16 )
                            dx = ( x2 - x1 ) / d
                            missacc = 0.0
                            for i in range ( d ) :
                                sx = x1 + dx * 0.5 + dx * i
                                sy2 = ( R - t - f ) ** 2 - sx ** 2
                                if sy2 >= 0 :
                                    sy = math.sqrt ( sy2 )
                                else :
                                    sy = y1
                                if sy > y1 :
                                    if sy > y2 :
                                        sy = y2
                                    missacc += dx * ( sy - y1 )
                    miss += missacc
        ans = ( all - miss ) / all
C.__doc__ = _pylab.show ( )
return C
