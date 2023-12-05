def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.b4 = 0
            self.b2 = 0
            self.b1 = 0
            self.N = len ( sys.argv )
            for i in range ( self.N ) :
                a = sys.argv [ i ]
                count = 0
                while a % 2 == 0 :
                    a //= 2
                    count += 1
                if count >= 2 :
                    self.b4 += 1
                elif count >= 1 :
                    self.b2 += 1
                elif count == 0 :
                    self.b1 += 1
            if self.b2 > 0 :
                if self.b4 >= self.b1 :
                    print ( "Yes" )
                    return
                else :
                    print ( "No" )
                    return
            if self.b2 == 0 :
                if self.b4 + 1 >= self.b1 :
                    print ( "Yes" )
                    return
                else :
                    print ( "No" )
