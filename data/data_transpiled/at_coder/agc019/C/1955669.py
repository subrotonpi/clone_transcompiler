def _import ( ) :
    from math import sin , cos , pi
    class Fountain :
        def __init__ ( self , X , Y ) :
            self.X = X
            self.Y = Y
    class Main ( object ) :
        def __init__ ( self , X , Y ) :
            self.X = X
            self.Y = Y
        def __call__ ( self , * args ) :
            return ( self.X , self.Y )
    x1 , y1 , x2 , y2 = [ int ( x ) for x in [ 0 , 1 ] ]
    if x1 > x2 :
        tmp = x1
        x1 , x2 = x2 , tmp
        tmp = y1
        y1 , y2 = y2 , tmp
    N = len ( sys.argv )
    fountain = [ ]
    for i in range ( N ) :
        fountain.append ( Fountain ( i , x ) )
    if y1 > y2 :
        y1 = int ( 1e8 - 1 - y1 )
        y2 = int ( 1e8 - 1 - y2 )
        for i in range ( N ) :
            fountain [ i ].Y = int ( 1e8 - 1 - fountain [ i ].Y )
    fountain.sort ( lambda a , b : a.X - b.X )
    lis = [ 0 ] * N + [ 1 ]
    lis [ 0 ] = 0
    for i in range ( N ) :
        if fountain [ i ].X < x1 or fountain [ i ].X > x2 :
            continue
        if fountain [ i ].Y < y1 or fountain [ i ].Y > y2 :
            continue
        left = right = N + 1
        while 1 :
            center = ( left + right ) // 2
            if lis [ center ] > fountain [ i ].Y :
                right = center
            else :
                left = center
            if right - left == 1 :
                break
            lis [ right ] = fountain [ i ].Y
    for i in range ( N ) :
        if lis [ i ] < int ( i ) :
            ans = float ( x2 - x1 + y2 - y1 ) * 100
            ans -= i * ( 20 - 5 * pi )