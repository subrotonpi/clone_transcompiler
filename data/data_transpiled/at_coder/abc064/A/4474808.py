def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            s = [ sc.get ( 'x' ) , sc.get ( 'y' ) , sc.get ( 'z' ) ]
            a = sum ( s )
            if a % 4 == 0 :
                print ( 'YES' , end = ' ' )
            else :
                print ( 'NO' , end = ' ' )
    return Main
