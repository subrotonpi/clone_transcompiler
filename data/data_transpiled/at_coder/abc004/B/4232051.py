def main ( ) :
    import sys
    from nltk.corpus import brown
    sc = brown.corpus ( 'board' )
    board = [ ]
    dummy = [ ]
    for line in sc.text.split ( ) :
        board.append ( line.split ( ) )
    for i in range ( 4 ) :
        for j in range ( 4 ) :
            dummy [ i ] [ j ] = board [ i ] [ j ]
    for i in range ( 4 ) :
        for j in range ( 4 ) :
            board [ i ] [ j ] = dummy [ 3 - i ] [ 3 - j ]
    s = ""
    for i in range ( 4 ) :
        for j in range ( 4 ) :
            s += board [ i ] [ j ]
            if j != 3 :
                s += ""
        print ( s )
        s = ""
