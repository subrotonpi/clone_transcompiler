def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.height = int ( sys.stdin.readline ( ).strip ( ) )
            self.width = int ( sys.stdin.readline ( ).strip ( ) )
            self.oddCoin = [ ]
            for i in range ( self.height ) :
                for j in range ( self.width ) :
                    self.oddCoin [ i ].append ( self.raw_input ( ) % 2 == 1 )
    count = 0
    output = [ ]
    for i in range ( self.height - 1 ) :
        for j in range ( self.width ) :
            if oddCoin [ i ] [ j ] :
                count += 1
                self.oddCoin [ i ] [ j ] = not oddCoin [ i ] [ j ]
                self.oddCoin [ i + 1 ] [ j ] = not oddCoin [ i + 1 ] [ j ]
                output.append ( "{} {} {} {}".format ( self.height , self.width , self.height , self.height + 1 ) )
    for j in range ( self.width - 1 ) :
        if oddCoin [ self.height - 1 ] [ j ] :
            count += 1
            self.oddCoin [ self.height - 1 ] [ j ] = not oddCoin [ self.height - 1 ] [ j ]
            self.oddCoin [ self.height - 1 ] [ j + 1 ] = not oddCoin [ self.height - 1 ] [ j + 1 ]
            output.append ( "{} {} {} {}".format ( self.height , self.height , self.height + 1 , self.height + 2 ) )
    print ( count )
    for i in output :
        print ( i )
