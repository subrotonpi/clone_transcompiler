def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.input = [ ]
            self.five_count = 0
            self.seven_count = 0
            for i in range ( 3 ) :
                self.input.append ( i )
                if self.input [ i ] == 5 and self.five_count < 2 :
                    self.five_count += 1
                elif self.input [ i ] == 7 and self.seven_count < 1 :
                    self.seven_count += 1
                else :
                    self.print ( "NO" )
                    return
            print ( "YES" )
    return Main ( )
