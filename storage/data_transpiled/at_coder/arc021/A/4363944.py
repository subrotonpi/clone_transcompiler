def import import sys , string , ** kwargs ) :
    from matplotlib import pyplot as plt
    from matplotlib.backends import backend_agg
    from matplotlib.pylab import Figure
    fig = kwargs.pop ( 'figure' , Figure ( ) )
    dx = [ - 1 , 0 , 1 , 0 ]
    dy = [ 0 , - 1 , 0 , 1 ]
    A = [ [ sc.randint ( 0 , 4 ) for i in range ( 4 ) ] for j in range ( 4 ) ]
    c = 0
    for i in range ( 4 ) :
        for j in range ( 4 ) :
            for k in range ( 4 ) :
                x = j + dx [ k ]
                y = i + dy [ k ]
                if d ( x , y ) :
                    if A [ i , j ] == A [ y , x ] :
                        c += 1
    out ( 'GAMEOVER' if c == 0 else 'CONTINUE' )
