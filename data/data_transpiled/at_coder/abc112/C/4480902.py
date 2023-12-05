def main ( ) :
    import sys
    from math import sin , cos , cos , tan , label
    with open ( '../examples/main.txt' , 'r' ) as f :
        n = int ( f.read ( ) )
        points = [ Point ( f.read ( ) , f.read ( ) , f.read ( ) ) for f in f.readlines ( ) ]
    ans = - 1
    ans = - 1
    ans = - 1
    label :
    for x in range ( 101 ) :
        for y in range ( 101 ) :
            base_h = - 1
            flg = True
            for point in points :
                if point.h > 0 :
                    h = point.h + abs ( x - point.x ) + abs ( y - point.y )
                    if base_h == - 1 :
                        base_h = h
                    elif base_h != h :
                        flg = False
                        break
            if flg :
                for point in points :
                    if point.h == 0 :
                        if base_h > abs ( x - point.x ) + abs ( y - point.y ) :
                            flg = False
                            break
                if not flg :
                    continue
                ans = x
                ans = y
                ans = base_h
                break label
    print ( ans , ans , ans )
    class Point ( object ) :
        x = x
        y = y
        h = 0
        def __init__ ( self , x , y , h ) :
            self.x = x
            self.y = y
            self.h = h
