def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            A = int ( sc.readline ( ) )
            B = int ( sc.readline ( ) )
            C = int ( sc.readline ( ) )
            K = int ( sc.readline ( ) )
            hako = [ A , B , C ]
            hako.sort ( )
            max = hako [ 2 ]
            for i in range ( K ) :
                max = max * 2
            max = max + hako [ 0 ] + hako [ 1 ]
            sys.stdout.write ( max )
