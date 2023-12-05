def qualB ( ) :
    from os import rename
    from os.path import join
    from os.path import join
    from os.path import join
    from os.path import join
    from os.path import join
    from os.path import join
    from os.path import join
    from os.path import join
    from os.path import isfile
    from os.path import join
    from os.path import join
    from os.path import join
    from os.path import join
    from os.path import join
    from os import sep
    prblm = 'B'
    fl = True
    filein = '%s-%s.in.txt' % ( prblm , ( 'large' if fl else 'small' ) )
    fileout = '%s-%s.out.txt' % ( prblm , ( 'large' if fl else 'small' ) )
    with open ( filein , 'r' ) as fr :
        with open ( fileout , 'w' ) as fw :
            s = fr.readline ( )
            T = int ( s )
            for i in range ( 1 , T + 1 ) :
                s = fr.readline ( )
                tok = s.split ( )
                C = float ( tok [ 0 ] )
                F = float ( tok [ 1 ] )
                X = float ( tok [ 2 ] )
                res = 0
                if X <= C :
                    res = X / 2
                else :
                    res = C / 2
                    rate = 2
                    while ( X - C ) * ( rate + F ) > X * rate :
                        rate += F
                        res += C / rate
                    res += ( X - C ) / rate
                print ( res )
                fw.write ( 'Case #%d: %f\n' % ( i , res ) )
