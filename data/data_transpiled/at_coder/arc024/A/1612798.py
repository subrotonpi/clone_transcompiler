def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.L = [ ]
        self.R = [ ]
        self.Left = [ ]
        self.Right = [ ]
    def input ( self ) :
        with open ( self.L ) as f :
            self.L = f.read ( )
        with open ( self.R ) as f :
            self.Left.append ( f.read ( ) )
        for i in range ( self.L ) :
            self.Right.append ( f.read ( ) )
    def main ( self ) :
        self.input ( )
        ans = 0
        for i in range ( self.L ) :
            for j in range ( self.R ) :
                if self.Left [ i ] == self.Right [ j ] :
                    self.Right.remove ( j )
                    ans += 1
                    break
        print ( ans )
