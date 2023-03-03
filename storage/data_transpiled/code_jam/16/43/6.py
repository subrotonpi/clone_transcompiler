def _ _ main _ _ ( ) : return int ( raw_input ( ) )
def main ( ) :
    global r , c , pairs
    r = sys.stdin.read ( )
    c = sys.stdin.read ( )
    pairs = [ ]
    for i in range ( 2 * ( r + c ) ) :
        pairs.append ( sys.stdin.read ( ) )
    if len ( pairs ) == 1 :
        new_i , new_j = cur_i , ( new_j + 1 ) % 4
        if len ( pairs ) == 1 and len ( pairs ) == 1 :
            continue
        if len ( pairs ) == 2 and len ( pairs ) == 3 :
            continue
        if len ( pairs ) == 3 :
            new_i , new_j = cur_i , ( new_j + 1 ) % 4
            if len ( pairs ) == 1 and len ( pairs ) == 1 :
                comp [ new_i , new_j ] = comps
        elif len ( pairs ) == 2 and len ( pairs ) == 2 :
            for i in range ( r ) :
                for j in range ( c ) :
                    if len ( pairs [ i ] ) == 1 and len ( pairs [ i ] ) == 2 :
                        if len ( pairs [ i ] ) == 1 and len ( pairs [ j ] ) == 1 :
                            comp [ new_i , new_j ] = comps
        elif len ( pairs ) == 3 and len ( pairs ) == 2 :
            for i in range ( r ) :
                for j in range ( c ) :
                    s1 , s2 = get_state ( pairs [ i ] ) , get_state ( pairs [ j ] )
                    if i / 2 == j / 2 :
                        if len ( comp [ s1.i , s1.j ] ) != 1 :
                            out.write ( u"%s\n" % ( field [ i ] ) )
                    else :
                        if len ( comp [ s1.i , s1.j ] ) == 1 :
                            out.write ( u"IMPOSSIBLE\n" )
        return True
    def get_state ( i ) :
        if i < c :
            return { 0 : i , 1 : 0 }
        elif i - c < r :
            return { 0 : i , 1 : j