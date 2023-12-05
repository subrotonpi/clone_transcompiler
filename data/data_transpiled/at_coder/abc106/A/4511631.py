def main ( ) :
    import sys
    class Main ( object ) :
        def process ( a , b ) :
            return str ( a * b - a - b + 1 )
        def process ( a , b ) :
            sc = sys.stdin
            a , b = sc.read ( ).split ( '\n' )
            ( result , _ ) = process ( a , b )
            print ( result )
    return Main
