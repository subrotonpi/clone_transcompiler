def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            n = int ( sc.readline ( ) )
            A = [ int ( sc.readline ( ) ) for i in range ( n ) ]
            A.sort ( key = lambda x : x [ 1 ] )
            Alice = 0
            Bob = 0
            for i in range ( 0 , n , 2 ) :
                Alice += A [ i ]
            for i in range ( 1 , n , 2 ) :
                Bob += A [ i ]
            print ( Alice - Bob )
