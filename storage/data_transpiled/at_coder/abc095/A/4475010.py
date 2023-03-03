def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            order = sc.readline ( )
            price = 700
            if order [ 0 ] == 'o' : price += 100
            if order [ 1 ] == 'o' : price += 100
            if order [ 2 ] == 'o' : price += 100
            print ( price )
    return Main
