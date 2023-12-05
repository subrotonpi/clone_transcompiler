def main ( arg = None ) :
    import sys
    class Main ( object ) :
        def __init__ ( self , arg ) :
            sc = sys.stdin
            S = sc.read ( )
            sc.close ( )
            print ( self.calc ( S ) )
        def calc ( S ) :
            s = S.split ( '' )
            count = 0
            for i in range ( 3 ) :
                if s [ i ] == '1' :
                    count += 1
            return count
    return Main ( )
