def import sys , string , traceback
class Main ( object ) :
    def __init__ ( self ) :
        self.n , self.m , self.a , self.b = string.split ( string.ascii_lowercase )
        self.a1 = string.split ( string.digits )
    def __init__ ( self ) :
        self.n , self.m = int ( self.n ) , int ( self.m )
        self.a = [ ]
        self.b = [ ]
        self.a1 = [ ]
        for i in range ( self.n ) :
            self.a1.append ( i )
        for i in range ( self.n ) :
            for j in range ( self.m ) :
                self.a [ i ] [ j ] = string.atoi ( self.a1 [ i ] [ j ] )
        for i in range ( self.n ) :
            for j in range ( self.m ) :
                self.b [ i ] [ j ] = 0
        for i in range ( self.n - 2 ) :
            for j in range ( 1 , self.m - 1 ) :
                if self.a [ i ] [ j ] != 0 :
                    self.b [ i + 1 ] [ j ] = self.a [ i ] [ j ]
                    self.a [ i + 1 ] [ j - 1 ] -= self.a [ i ] [ j ]
                    self.a [ i + 1 ] [ j + 1 ] -= self.a [ i ] [ j ]
                    self.a [ i + 2 ] [ j ] -= self.a [ i ] [ j ]
                    self.a [ i ] [ j ] = 0
        for i in range ( self.n ) :
            for j in range ( self.m ) :
                print ( self.b [ i ] [ j ] , end = '' )
            print ( '' , end = '' )
