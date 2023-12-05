def main ( args ) :
    import sys
    from os.path import basename
    with open ( basename ( sys.argv [ 0 ] ) ) as sc :
        input = sc.read ( )
        inputs = input.split ( )
        count = int ( inputs [ 0 ] )
        score = int ( inputs [ 1 ] )
        a = [ ]
        b = [ ]
        for i in range ( count ) :
            data = sc.read ( )
            datas = data.split ( )
            a.append ( int ( datas [ 0 ] ) )
            b.append ( int ( datas [ 1 ] ) )
        max_a = int ( 0 )
        for i in range ( count ) :
            if a [ i ] > max_a :
                max_a = a [ i ]
            elif a [ i ] == max_a :
                pass
        moves = 0
        b = [ i for i in range ( count ) if b [ i ] > max_a ]
        j = [ i for i in range ( count ) if b [ i ] > max_a ]
        b = j
        for i in range ( count ) :
            if b [ i ] >= max_a :
                moves = moves + 1
                score = score - b [ i ]
                if score <= 0 :
                    break
        if score > 0 :
            extra_moves = score / max_a
            if score - ( extra_moves * max_a ) > 0 :
                moves = moves + extra_moves + 1
            else :
                moves = moves + extra_moves
        print ( moves )
