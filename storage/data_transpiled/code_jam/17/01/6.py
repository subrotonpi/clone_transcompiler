def import solve
class A ( object ) :
    def __init__ ( self , name , size ) :
        self.name = name
        self.size = size
    def solve ( self ) :
        self.size = size
        count = 0
        for i in range ( len ( self.name ) - self.size + 1 ) :
            if self.name [ i ] != 0 :
                count += 1
                for j in range ( i , i + size ) :
                    self.name [ j ] = self.name [ j ] == 1
        for i in range ( len ( self.name ) - self.size + 1 , len ( self.name ) ) :
            if self.name [ i ] != 0 :
                return - 1
        return count
    def solve ( self ) :
        T = len ( self.name )
        for t , c in solve ( ) :
            print ( "Case #%d: %s" % ( t + 1 , str ( c ) if c >= 0 else "IMPOSSIBLE" ) )
