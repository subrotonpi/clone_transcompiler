def import solve
class Main ( object ) :
    def __init__ ( self , s ) :
        self.solve ( s )
    def solve ( self , n ) :
        for i in range ( ( n + 8 ) // 9 ) :
            print ( ( n - 1 ) % 9 + 1 , end = ' ' )
        print ( )
