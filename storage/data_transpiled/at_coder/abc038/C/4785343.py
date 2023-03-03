def Main ( ) :
    global _Main
    global _Main
    global _Main
    n , c = _Main.value , 0
    count = [ 0 ] * n
    for i , l in enumerate ( _Main ) :
        if l < ( l ) :
            c += 1
        else :
            for j in range ( c ) :
                count [ j ] += c - j
            c = 0
    for j in range ( c ) :
        count [ j ] += c - j
    print ( n , sum ( count ) )
