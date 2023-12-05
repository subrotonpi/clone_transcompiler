def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.N = 0
        self.x = [ ]
        self.y = [ ]
    def input ( self ) :
        with open ( self.filename , 'r' ) as f :
            self.N = f.read ( )
    def main ( self ) :
        self.x = [ ]
        self.y = [ ]
    def input ( self ) :
        self.N = len ( self.x )
        for i in range ( self.N ) :
            self.x.append ( self.x [ i ] )
            self.y.append ( self.y [ i ] )
    def input ( self ) :
        self.N = len ( self.x )
        ans = 0
        for i in range ( self.N ) :
            for j in range ( self.N ) :
                for k in range ( self.N ) :
                    if i != j and j != k and i != k :
                        ax = self.x [ k ] - self.x [ i ]
                        ay = self.y [ k ] - self.y [ i ]
                        bx = self.x [ j ] - self.x [ i ]
                        by = self.y [ j ] - self.y [ i ]
                        area = abs ( ax * by - ay * bx )
                        if area and area % 2 == 0 :
                            ans += 1
        print ( ans / 6 )
