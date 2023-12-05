def main ( ) :
    from os.path import join
    from os import rename
    from os.path import join
    from os.path import join
    from os.path import join
    from os.path import join
    from os.path import join
    from os.path import join
    from os.path import join
    from os.path import join
    from os.path import join
    from os.path import join
    from os.path import join
    prblm = join ( 'A' , 'R' )
    fl = True
    filein = join ( prblm , '-' , 'large' if ( fl ) else 'small' ) + '.in.txt'
    fileout = join ( prblm , '-' , 'large' if ( fl ) else 'small' ) + '.out.txt'
    with open ( filein , 'r' ) as fr :
        with open ( fileout , 'w' ) as fw :
            s = fr.readline ( )
            T = int ( s )
            for i in range ( 1 , T + 1 ) :
                s = fr.readline ( )
                tok = s.split ( )
                r , t = map ( int , tok [ : 2 ] )
                mn , mx = 0 , 2000000000.
                while mx - mn > 0 :
                    v = ( mn + mx + 1 ) / 2
                    if int ( v ) / ( 2 * r + 2 * v - 1 ) < v or v * ( 2 * r + 2 * v - 1 ) > t :
                        mx = v - 1
                    else :
                        mn = v
                print ( mn )
                fw.write ( 'Case #%d: %d\n' % ( i , mn ) )
