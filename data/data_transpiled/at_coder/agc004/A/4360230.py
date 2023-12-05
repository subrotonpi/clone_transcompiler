def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
            arr = [ ]
            for i in range ( 3 ) :
                arr.append ( sc.read ( ) )
                if arr [ i ] % 2 == 0 :
                    print ( 0 )
                    return
            arr.sort ( )
            print ( arr [ 0 ] * arr [ 1 ] )
