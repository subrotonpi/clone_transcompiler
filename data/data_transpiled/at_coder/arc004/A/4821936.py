def main ( ) :
    import sys
    from matplotlib import pyplot as plt
    from matplotlib.backends.backend_agg import FigureCanvasAgg
    from matplotlib.pylab import Figure
    fig = plt.figure ( )
    n = fig.canvas.get_figure ( ).get_figsize ( )
    p = [ FigureCanvasAgg ( fig , Figure ( ) ) for fig in fig.get_fignums ( ) ]
    ans = 0
    for i in range ( n - 1 ) :
        for j in range ( i + 1 , n ) :
            ans = max ( ans , p [ i ].distance ( p [ j ] ) )
    print ( ans )
    plt.show ( )
