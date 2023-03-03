def import import sys
class Main ( object ) :
    TABLE = ( - 1 , 1 , 1 , 2 , - 1 , 4 , 9 , 8 , - 1 , 3 , 8 , 5 , 7 , 9 , - 1 , 7 , 4 , 0 , 6 , 3 , - 1 , 5 , 2 , 6 , - 1 , 0 )
    def __init__ ( self , n ) :
        self.n = n
    def run ( self ) :
        self.n = n
        self.s = [ ]
        self.count = 0
        for i in range ( self.n ) :
            if self.count != 0 :
                self.s.append ( " " )
            s = self.s.lower ( )
            self.count = 0
            for c in s :
                if c < 'a' or c > 'z' :
                    continue
                v = self.TABLE [ c - 'a' ]
                if v == - 1 :
                    continue
                self.s.append ( v )
                self.count += 1
        print ( "\n".join ( self.s ).strip ( ) )
