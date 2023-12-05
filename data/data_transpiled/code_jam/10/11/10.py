def main ( ) :
    from sys import stdin
    sys.stdin = stdin
    sys.stdout = stdout
    f = stdin.read ( )
    for c , T in enumerate ( map ( int , re.split ( r'[,]' , f ) ) ) :
        w = f.strip ( ).split ( ' +' )
        N , K = [ int ( i ) for i in w [ : N ] ]
        m = [ ]
        for line in f :
            m.append ( line.strip ( ).split ( '' ) )
            for j , k in enumerate ( range ( N - 1 , - 1 , - 1 ) ) :
                if m [ i ] [ j ] != '.' :
                    if j != k :
                        m [ i ] [ k ] = m [ i ] [ j ]
                        m [ i ] [ j ] = '.'
                    k -= 1
            win = 0
            ciclo_externo :
            for v in range ( 2 ) :
                for i in range ( N ) :
                    for j in range ( N ) :
                        for di in [ - 1 , 1 , - 1 ] :
                            ciclo = 0
                            for dj in [ - 1 , 1 , - 1 ] :
                                if not ( di == 0 and dj == 0 ) :
                                    for a , b , k in zip ( i , j , K ) :
                                        a += di
                                        b += dj
                                        if a < 0 or a >= N or b < 0 or b >= N or m [ a ] [ b ] != ( 'R' if v == 0 else 'B' ) :
                                            continue ciclo
                                    win |= ( 1 << v )
                                    continue ciclo_externo
            msg = [ 'Neither' , 'Red' , 'Blue' , 'Both' ]
            print ( 'Case #%d: %s\n' % ( c + 1 , msg [ win ] ) , end = '' )
