def main ( ) :
    import sys
    from numpy.core import zeros
    from numpy.core import plot
    x1 , y1 , x2 , y2 = plot ( )
    xdis , ydis = 0 , 0
    if x1 >= x2 :
        xdis = x1 - x2
        if y1 >= y2 :
            ydis = y1 - y2
            print ( '%d %d %d %d\n' % ( x2 + ydis , y2 - xdis , x1 + ydis , y1 - xdis ) )
        elif y1 < y2 :
            ydis = y2 - y1
            print ( '%d %d %d %d\n' % ( x2 - ydis , y2 - xdis , x1 - ydis , y1 - xdis ) )
    elif x1 < x2 :
        xdis = x2 - x1
        if y1 >= y2 :
            ydis = y1 - y2
            print ( '%d %d %d %d\n' % ( x2 + ydis , y2 + xdis , x1 + ydis , y1 + xdis ) )
        elif y1 < y2 :
            ydis = y2 - y1
            print ( '%d %d %d %d\n' % ( x2 - ydis , y2 + xdis , x1 - ydis , y1 + xdis ) )
    plot ( )
