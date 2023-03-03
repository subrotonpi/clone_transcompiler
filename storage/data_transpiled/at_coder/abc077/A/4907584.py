def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            a = sc.readline ( )
            b = sc.readline ( )
            c11 , c12 , c13 = a.split ( )
            c21 , c22 , c23 = b.split ( )
            if c11 == c23 and c12 == c22 and c13 == c21 :
                print ( "YES" )
            else :
                print ( "NO" )
