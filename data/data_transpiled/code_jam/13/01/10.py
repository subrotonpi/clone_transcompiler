def ticTacToeTomek ( x ) :
    global board
    words = [ 'X won' , 'O won' , 'Draw' , 'Game has not completed' ]
    if r : return r
    r = True
    for i in range ( 4 ) :
        if b [ i ] [ 3 ] != x and b [ i ] [ 3 ] != 3 :
            r = False
            break
    if r : return r
    return r
