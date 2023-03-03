def main ( ) :
    import math
    class Main ( object ) :
        def __init__ ( self ) :
            self.a = math.sin ( math.pi * math.pi )
            self.b = math.sin ( math.pi * math.pi * math.pi )
            if b < a :
                t = a
                a = b
                b = t
    center = ( a + b ) / math.sqrt ( 2 )
    ridge = math.atan ( a / b )
    n = len ( sys.argv )
    for i in range ( n ) :
        c = sys.argv [ i ]
        d = sys.argv [ i + 1 ]
        if d < c :
            t = c
            c = d
            d = t
        if center < c :
            print ( "YES" )
            continue
        if c < a :
            print ( "NO" )
            continue
        p = math.pi / 4.0
        f = 0.0
        for _ in range ( 50 ) :
            x = ( p + f ) / 2
            if a * math.cos ( x ) + b * math.sin ( x ) >= c :
                p = x
            else :
                f = x
        print ( "YES" if min ( b , a * math.sin ( p ) + b * math.cos ( p ) ) <= d else "NO" )
