def _code_jam4 ( a ) :
    import sys
    for i , j in enumerate ( a [ : - 1 ] ) :
        if a [ i ] > a [ i - 1 ] :
            break
    i -= 1
    if i == - 1 :
        return False
    for j in range ( len ( a ) - 1 ) :
        if a [ j ] > a [ i ] :
            break
    t = a [ j ]
    a [ i ] = t
    for i , j in enumerate ( a [ i + 1 : ] ) :
        t = a [ j ]
        a [ j ] = t
    C = int ( a [ 0 ] )
    for no in range ( 1 , C + 1 ) :
        M = int ( a [ 0 ] )
        X = [ ]
        Y = [ ]
        trans = [ ]
        for i in range ( M - 1 ) :
            with open ( 'C:\\' + str ( no ) + '.txt' , 'r' ) as cin :
                x , y = cin.read ( ).split ( ' ' )
                X.append ( x )
                Y.append ( y )
        N = int ( a [ 0 ] )
        AX = [ ]
        AY = [ ]
        for i in range ( N - 1 ) :
            with open ( 'C:\\' + str ( no ) + '.txt' , 'r' ) as cin :
                x , y = cin.read ( ).split ( ' ' )
                AX.append ( x )
                AY.append ( y )
        for i in range ( M ) :
            trans.append ( i )
        flag = True
        while True :
            d = { }
            for i in range ( M - 1 ) :
                d [ trans [ X [ i ] ] ] = d [ trans [ Y [ i ] ] ] = 1
            flag = True
            for i in range ( N - 1 ) :
                if d [ trans [ X [ i ] ] ] == 0 :
                    flag = False
                    break
            if flag :
                break
    return True
