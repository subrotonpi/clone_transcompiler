def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.n = int ( self.n )
            self.a = int ( self.a )
            self.b = int ( self.b )
            self.c = int ( self.c )
            self.d = int ( self.d )
            bl = False
            for i in range ( self.n ) :
                if self.a + self.c * i - self.d * ( self.n - i - 1 ) <= b and self.b <= self.a + self.d * i - self.c * ( self.n - i - 1 ) :
                    bl = True
            ans = ( bl == True ) and 'YES' or 'NO'
            print ( ans )
