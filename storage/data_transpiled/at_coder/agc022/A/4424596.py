def Main ( ) :
    _sys.stdin.write ( '\n' )
    s = _sys.stdin.read ( )
    if s == 'zyxwvutsrqponmlkjihgfedcba' :
        print ( - 1 )
    elif len ( s ) < 26 :
        for c in [ 'a' , 'z' ] :
            if s.find ( c ) == - 1 :
                print ( s + c )
                return
    else :
        c , last = s.split ( ' ' ) , c [ 25 ]
        use = [ c [ 25 ] - 'a' ]
        for i in range ( len ( c ) - 2 , - 1 , - 1 ) :
            if last < c [ i ] :
                use [ ( last , i ) ] = True
            else :
                for i1 in c [ i ] - 'a' :
                    if i1 in use :
                        print ( s [ : i ] + chr ( i1 + 'a' ) )
                        return
