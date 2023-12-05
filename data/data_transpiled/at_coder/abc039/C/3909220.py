def _import ( ) :
    from os import popen
    import csv
    from os.path import join
    from os.sep import sep
    import sys
    scales = [ 'Do' , 'Re' , 'Mi' , 'Fa' , 'So' , 'La' , 'Si' ]
    keys = [ 'W' , 'B' , 'W' , 'B' , 'W' , 'B' , 'W' , 'B' , 'W' , 'B' , 'W' ]
    with popen ( 'cat ' + sep + ' ' + ' '.join ( scales ) ) as f :
        S = f.read ( )
    f = open ( join ( sys.argv [ 1 ] , 'w' ) , 'w' )
    for i in range ( len ( scales ) ) :
        idx = 0
        cnt = 0
        for c in keys :
            if c == S [ 0 ] :
                cnt += 1
            if i < cnt :
                break
            idx += 1
        flg = True
        for c in S :
            if len ( keys ) <= idx :
                idx -= len ( keys )
            if c != keys [ idx ] :
                flg = False
                break
            idx += 1
        if flg :
            f.write ( '%s\n' % scales [ i ] )
            break
    f.close ( )
