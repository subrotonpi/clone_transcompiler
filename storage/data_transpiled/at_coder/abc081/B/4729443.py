def main ( arg = None ) :
    import sys
    class Main ( object ) :
        def __init__ ( self , fn ) :
            self.fn = fn
        def __call__ ( self , * args ) :
            sc = sys.stdin
            N = sc.readline ( ).strip ( )
            self.fn = fn
            str = sc.readline ( ).strip ( )
            sc.close ( )
            S = str.split ( )
            n = [ ]
            count = 0
            for i in range ( N ) :
                n.append ( int ( S [ i ] ) )
            for i in range ( 10000 ) :
                for j in n :
                    if n [ j ] % 2 == 0 :
                        n [ j ] = n [ j ] // 2
                    else :
                        print ( count )
                        sys.exit ( )
                count += 1
