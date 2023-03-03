def main ( ) :
    import math
    class Main ( object ) :
        def __init__ ( self ) :
            self.A = float ( 'inf' )
            self.B = float ( 'inf' )
            self.C = float ( 'inf' )
            self.ans1 = abs ( ( A / 2 - ( A - A / 2 ) ) * B * C )
            self.ans2 = abs ( A * ( B / 2 - ( B - B / 2 ) ) * C )
            self.ans3 = abs ( A * B * ( C / 2 - ( C - C / 2 ) ) )
            self.ans = min ( min ( self.ans1 , self.ans2 ) , self.ans3 )
            self.print ( self.ans )
