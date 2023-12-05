def main ( args ) :
    import sys
    from time import sleep
    sc = Scanner ( )
    n = sc.nextInt ( )
    a = sc.nextInt ( )
    b = sc.nextInt ( )
    for i in range ( n ) :
        tmps = sc.next ( )
        tmpd = sc.next ( )
        place += ( 1 if tmps == "East" else - 1 ) * ( tmpd < a )
    if place > 0 :
        print ( "East" , " " , place )
    elif place < 0 :
        print ( "West" , " " , - place )
    else :
        print ( 0 )
