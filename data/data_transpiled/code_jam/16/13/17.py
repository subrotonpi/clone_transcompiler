def search ( from_id , bffs , likes_me , exclude ) :
    best = 0
    for kid in likes_me [ from_id ] :
        if kid == exclude :
            continue
        else :
            ch = search ( kid , bffs , likes_me , - 1 )
            if ch > best :
                best = ch
    return best + 1
def main ( ) :
    with open ( '/proc/' , 'r' ) as f :
        cas = f.read ( )
        for c in range ( 1 , cas + 1 ) :
            print ( 'Case #%d: ' % c , end = '' )
            DISCONT_STRAT = 0
            CYCLE_STRAT_MAX = 0
            nkids = len ( f )
            bffs = [ ]
            likes_me = [ [ ] for _ in range ( nkids ) ]
            for i in range ( nkids ) :
                bffs.append ( f.read ( ) - 1 )
                likes_me [ bffs [ i ] ].append ( i )
            for i in range ( nkids ) :
                for kid in likes_me [ i ] :
                    if i in likes_me [ kid ] and i < kid :
                        LAYERS_DOWN = 0
                        r , l = search ( i , bffs , likes_me , kid )
                        DISCONT_STRAT += ( l + r )
        visited = [ False ]
        asd = [ False ]
        for ml in range ( nkids ) :
            [ ne , cccc ] = 0
            visited.append ( True )
            cccc += 1
            asd.append ( cccc )
            while not visited [ bffs [ ne ] ] :
                ne = ml
                cccc = 0
                visited [ bffs [ ne ] ] = True
                cccc += 1
                asd.append ( cccc )
        print ( max ( CYCLE_STRAT_MAX , DISCONT_STRAT ) )
