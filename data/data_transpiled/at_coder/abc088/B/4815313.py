def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            N = int ( sc.readline ( ) )
            card = [ int ( i ) for i in sc.readline ( ).split ( ) ]
            Alice = 0
            Bob = 0
            for i in range ( N ) :
                card [ i ] = int ( sc.readline ( ) )
            card = [ i for i in list ( reversed ( card ) ) if i ]
            for i in range ( N ) :
                if i % 2 == 0 :
                    Alice += card [ i ]
                else :
                    Bob += card [ i ]
            print ( Alice - Bob , end = ' ' )
