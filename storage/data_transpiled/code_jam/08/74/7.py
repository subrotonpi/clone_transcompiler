def __main__ ( ) :
    from os import system , getbit
    stem = "c:/jam/D-small-attempt0"
    with open ( stem + ".in" , "r" ) as f :
        np = len ( f.readlines ( ) )
        f.write ( "Case #%d: %s\n" % ( np , ret ) )
    with open ( stem + ".out" , "w" ) as f :
        for i in range ( 1 , np + 1 ) :
            ret = solve ( f )
            f.write ( "Case #%d: %s\n" % ( i , ret ) )
