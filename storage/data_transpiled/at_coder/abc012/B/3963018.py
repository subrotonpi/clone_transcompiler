def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            N = sc.read ( )
            h = N // 3600
            m = ( N % 3600 ) // 60
            s = ( N % 3600 ) % 60
            print ( '%02d' % h , '%02d' % m , '%02d' % s )
