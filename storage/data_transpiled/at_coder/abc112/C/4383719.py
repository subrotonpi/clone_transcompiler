def main ( ) :
    import sys
    try :
        N = sys.argv [ 1 ]
    except IndexError :
        N = 0
    x = [ ]
    y = [ ]
    h = [ ]
    for i in range ( N ) :
        x.append ( i )
        y.append ( i )
        h.append ( i )
    X = Y = H = 0
    loop :
    for cx in range ( 0 , 100 ) :
        for cy in range ( 0 , 100 ) :
            for i in range ( N ) :
                if h [ i ] != 0 :
                    H = h [ i ] + abs ( cx - x [ i ] ) + abs ( cy - y [ i ] )
                    break
            H = get_height ( H , cx , cy , N , h , x , y )
            if H != - 1 :
                X = cx
                Y = cy
                break loop
    print ( X , Y , H )
