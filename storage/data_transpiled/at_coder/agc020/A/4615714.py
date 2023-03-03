def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            print ( ( sc.randint ( 0 , 1 ) + sc.randint ( 0 , 1 ) + sc.randint ( 0 , 1 ) ) % 2 == 0 )
