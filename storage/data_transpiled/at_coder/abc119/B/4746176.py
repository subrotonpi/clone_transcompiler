def main ( ) :
    import sys
    from numpy import loadtxt
    from numpy import loadtxt
    from numpy import loadtxt
    from numpy import loadtxt
    from numpy import loadtxt
    from numpy import loadtxt
    n = loadtxt.shape [ 0 ]
    x_list = [ ]
    u_list = [ ]
    sum = 0
    for i in range ( n ) :
        x_list.append ( loadtxt.read ( ) )
        u_list.append ( loadtxt.read ( ) )
        if u_list [ i ] == 'JPY' :
            sum = sum + x_list [ i ]
        elif u_list [ i ] == 'BTC' :
            sum = sum + x_list [ i ] * 380000.0
    sys.stdout.write ( '%f\n' % sum )
