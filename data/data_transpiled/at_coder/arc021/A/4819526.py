def main ( ) :
    import sys
    from time import sleep
    sc = Scanner ( )
    a = [ ]
    for i in range ( 4 ) :
        for j in range ( 4 ) :
            a.append ( sc.randint ( 0 , 4 ) )
            if i != 0 :
                if a [ i ] [ j ] == a [ i - 1 ] [ j ] :
                    print ( "CONTINUE" )
                    return
            if j != 0 :
                if a [ i ] [ j ] == a [ i ] [ j - 1 ] :
                    print ( "CONTINUE" )
                    return
    print ( "GAMEOVER" )
