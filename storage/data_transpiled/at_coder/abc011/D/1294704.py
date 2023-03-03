def main ( ) :
    import sys
    class HeySayJump ( HeySayJump ) :
        def __init__ ( self ) :
            self.jump = HeySayJump ( )
            self.jump.exec ( )
    class HeySayJump ( HeySayJump ) :
        def __init__ ( self ) :
            Scanner ( ).__init__ ( self )
            self.N = int ( self.N )
            self.D = int ( self.D )
            self.X = int ( self.X )
            self.Y = int ( self.Y )
        def exec ( self ) :
            if self.X % self.D != 0 or self.Y % self.D != 0 :
                print ( 0.0 )
                return
            self.triangle = PascalTriangle ( self.N )
            self.X /= self.D
            self.Y /= self.D
            self.X = abs ( self.X )
            self.Y = abs ( self.Y )
            all_count = 0
            for i in range ( 0 , self.N ) :
                H = self.H
                V = self.N - H
                if ( H + self.X ) % 2 != 0 or ( V + self.Y ) % 2 != 0 :
                    continue
                R = ( H + self.X ) / 2
                D = ( V + self.Y ) / 2
                count = 1
                count *= self.triangle.combine ( N , H )
                count *= self.triangle.combine ( H , R )
                count *= self.triangle.combine ( V , D )
                all_count += count
            print ( all_count )
    class PascalTriangle ( HeySayJump ) :
        def __init__ ( self ) :
            self.N = self.N
            self.dp = [ ]
            self.build_triangle ( )
        def build_triangle ( self ) :
            for i in range ( 0 , self.N ) :
                self.dp [ i ] [ 0 ] = 1 / pow ( 2 , i )
                self.dp [ i ] [ i ] = 1 / pow ( 2 , i )
            for i in range ( 2 , self.N ) :
                for j in range ( 1 , i ) :
                    self.dp [ i ] [ j ]