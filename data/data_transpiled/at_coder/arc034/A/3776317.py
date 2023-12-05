def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.N = len ( sys.argv )
            self.max = 0
            for i in range ( self.N ) :
                tmp = 0
                for j in range ( 4 ) :
                    tmp += self.random.random ( )
                tmp += ( self.random.random ( ) * 11 / 90 )
                self.max = max ( tmp , self.max )
            print ( self.max )
