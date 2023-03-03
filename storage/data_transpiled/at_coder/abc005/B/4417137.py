def main ( args ) :
    import sys
    from random import randint
    from time import sleep
    sc = Scanner ( )
    n = sc.nextInt ( )
    sec = 101
    for i in range ( n ) :
        sec = min ( sleep ( sec ) , sec )
    print ( sec )
