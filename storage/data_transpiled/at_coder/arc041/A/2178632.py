def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.x , self.y , self.k = sys._getframe ( 1 ).f_locals.get ( 'x' , None )
            self.ans = self.x + self.k - ( ( self.y < self.k ) * self.k - 2 * self.y )
            print ( self.ans )
