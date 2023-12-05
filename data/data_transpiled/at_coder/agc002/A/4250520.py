def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            a , b = sc.read ( ) , sc.read ( )
            if a < 0 and b >= 0 or a == 0 :
                print ( "Zero" )
            elif b < 0 and ( b - a ) % 2 or a > 0 :
                print ( "Positive" )
            else :
                print ( "Negative" )
    return Main
