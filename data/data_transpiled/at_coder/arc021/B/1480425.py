def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.C = sys.stdin.read ( )
            self.B = [ ]
            self.check = 0
            for i in range ( self.L ) :
                B.append ( self.C [ i ] )
                if i != self.L - 1 :
                    check = check ^ B [ i ]
            if check != B [ self.L - 1 ] :
                print ( - 1 )
                return
    A = [ 0 ]
    for i in range ( 1 , self.L - 1 ) :
        A.append ( A [ i - 1 ] ^ B [ i - 1 ] )
    A [ self.L - 1 ] = A [ 0 ] ^ B [ self.L - 1 ]
    for i in range ( self.L ) :
        print ( A [ i ] )
