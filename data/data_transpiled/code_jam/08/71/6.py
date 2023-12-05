def main ( ) :
    from pyama import solve
    stem = "c:/jam/A-large"
    with open ( stem + ".in" , "r" ) as f :
        np = f.read ( )
    with open ( stem + ".out" , "w" ) as f :
        for i in range ( 1 , np + 1 ) :
            ret = solve ( f )
            f.write ( "Case #{}: {}\n".format ( i , ret ) )
            print ( "Case #{}: {}\n".format ( i , ret ) )
    from pyama import solve
    n = f.read ( )
    f.write ( "\n" )
    ings = { }
    root = ""
    for i , l in enumerate ( solve ( f ) ) :
        tks = l.split ( )
        if i == 0 :
            root = tks [ 0 ]
        it = [ t for t in tks [ 2 : ] if t.isupper ( ) ]
        ings [ tks [ 0 ] ] = it
    def dos ( ings , root ) :
        it = ings [ root ]
        nis = [ ]
        for ing in it :
            if ing [ 0 ].isupper ( ) :
                nis.append ( dos ( ings , ing ) )
        mx = 0
        nis.sort ( )
        for i in nis :
            mx = max ( mx , i + len ( nis ) - 1 - i )
        return max ( mx , len ( nis ) + 1 )
    return ""
