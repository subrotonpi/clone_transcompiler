def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        s = sc.readline ( ).split ( )
        H , W = [ int ( s [ 0 ] ) for s in s [ 1 : ] ]
        map = [ [ ] for _ in range ( H ) ]
        route = [ [ ] for _ in range ( H ) ]
        dots = 0
        for i , str in enumerate ( sc ) :
            for j in range ( W ) :
                map [ i ] [ j ] = str [ j ]
                if i == 0 and j == 0 :
                    route [ i ] [ j ] = 1
                    dots += 1
                elif map [ i ] [ j ] == '.' :
                    route [ i ] [ j ] = 0
                    dots += 1
                else :
                    route [ i ] [ j ] = - 1
    ih = [ + 1 , 0 , - 1 , 0 ]
    iw = [ 0 , + 1 , 0 , - 1 ]
    qh = Queue ( )
    qw = Queue ( )
    qh.put ( 0 )
    qw.put ( 0 )
    b = False
    while qh :
        nh = qh.get ( )
        nw = qw.get ( )
        if nh == H - 1 and nw == W - 1 :
            b = True
            break
        for fh in range ( 4 ) :
            fh = nh + ih [ fh ]
            fw = nw + iw [ fh ]
            if fh >= 0 and fw >= 0 and fh < H and fw < W and route [ fh ] [ fw ] == 0 :
                qh.put ( fh )
                qw.put ( fw )
                route [ fh ] [ fw ] = route [ nh ] [ nw ] + 1
    if b :
        print ( dots - route [ H - 1 ] [ W - 1 ] )
    else :
        print ( - 1 )
