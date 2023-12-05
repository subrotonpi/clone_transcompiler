def import _scanner
class Main ( object ) :
    def __init__ ( self , sc ) :
        self.sc = sc
    def main ( self ) :
        print ( max ( self.sc.x ** self.sc.x , self.sc.y ** self.sc.y ) )
