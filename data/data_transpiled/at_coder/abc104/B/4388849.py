def __contains_c ( s ) :
    import re
    class Main ( object ) :
        def __init__ ( self , s ) :
            self.s = s
            self.ccount = 0
            for i in range ( 2 , len ( self.s ) - 1 ) :
                if self.s [ i ] == 'C' :
                    self.ccount += 1
            return self.ccount == 1
        def isLowerCaseWoAAndC ( self ) :
            self.s = s
            for i in range ( 1 , len ( self.s ) ) :
                if self.s [ i ] == 'C' :
                    continue
                if self.s [ i ] == self.s [ i ].upper ( ) :
                    return False
            return True
        def main ( self ) :
            with open ( self.s ) as f :
                s = f.read ( )
                if s [ 0 ] == 'A' and __contains_c ( s ) and __lowerCaseWoAAndC ( s ) :
                    print ( 'AC' )
                    return True
                print ( 'WA' )
    return Main
