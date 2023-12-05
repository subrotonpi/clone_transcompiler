def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.S = sys.stdin.read ( )
        self.T = sys.stdin.read ( )
        self.n = len ( S )
        s = S.split ( ' ' )
        self.t = T.split ( ' ' )
        self.a = [ 0 ] * 26
        self.b = [ 0 ] * 26
        for i in range ( self.n ) :
            self.a [ s [ i ] - 97 ] += 1
            self.b [ t [ i ] - 97 ] += 1
        self.a = sorted ( self.a )
        self.b = sorted ( self.b )
        for i in range ( self.26 ) :
            if self.a [ i ] != self.b [ i ] :
                print ( 'No' )
                break
            elif i == 25 :
                print ( 'Yes' )
