def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.a = [ ]
            self.a.append ( 87 )
            self.a.append ( 2 )
            self.a.append ( 1 )
            self.N = self.a.count ( )
            for i in range ( 2 , self.N + 1 ) :
                self.a [ i ] = self.a [ i - 1 ] + self.a [ i - 2 ]
            print ( self.a [ N ] )
