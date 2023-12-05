def main ( * args ) :
    import sys
    class C ( object ) :
        def __init__ ( self ) :
            self.N = len ( args )
            self.x = [ ]
            self.y = [ ]
            self.t = [ ]
            for i in range ( 1 , N + 1 ) :
                self.t.append ( self.x [ i ] )
                self.x.append ( self.y [ i ] )
            for i in range ( 1 , N + 1 ) :
                dist = abs ( self.x [ i ] - self.x [ i - 1 ] ) + abs ( self.y [ i ] - self.y [ i - 1 ] )
                if dist > self.t [ i ] - self.t [ i - 1 ] or ( dist - self.t [ i ] + self.t [ i - 1 ] ) % 2 != 0 :
                    print ( dist , i , file = sys.stderr )
                    print ( 'No' )
                    return
            print ( 'Yes' )
    class Main ( object ) :
        def __init__ ( self ) :
            self.C = C
    return Main
