def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.input = sys.stdin
        self.num_town = self.num_town
        self.input = sys.stdin
        self.val = [ ]
        for i in range ( self.num_town ) :
            self.val.append ( self.input )
        self.maxdiff = 0
        self.count = 0
        self.maxright = [ ]
        self.minleft = [ ]
        self.maxright.append ( self.val [ - 1 ] )
        self.minleft.append ( self.val [ 0 ] )
        for i in range ( 1 , self.num_town ) :
            self.minleft.append ( min ( self.minleft [ i - 1 ] , self.val [ i ] ) )
        for i in range ( self.num_town - 2 , - 1 , - 1 ) :
            self.maxright.append ( max ( self.maxright [ i + 1 ] , self.val [ i ] ) )
        for i in range ( self.num_town ) :
            if self.maxright [ i ] - self.minleft [ i ] > maxdiff :
                mr = self.maxright [ i ]
                ml = self.minleft [ i ]
                self.maxdiff = self.maxright [ i ] - self.minleft [ i ]
                count = 1
                while i < self.num_town and self.maxright [ i ] == mr and self.minleft [ i ] == ml :
                    i += 1
            elif self.maxright [ i ] - self.minleft [ i ] == maxdiff :
                count += 1
                mr = self.maxright [ i ]
                ml = self.minleft [ i ]
                while i < self.num_town and self.maxright [ i ] == mr and self.minleft [ i ] == ml :
                    i += 1
        print ( count )
