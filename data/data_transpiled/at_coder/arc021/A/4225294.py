def main ( ) :
    import sys
    from time import sleep
    sc = Scanner ( )
    arr = [ ]
    for i in range ( 4 ) :
        prev = 1
        for j in range ( 4 ) :
            a = sc.next ( )
            if a == prev :
                print ( "CONTINUE" )
                return
            if a == arr [ j ] :
                print ( "CONTINUE" )
                return
            prev = a
            arr.append ( a )
    print ( "GAMEOVER" )
