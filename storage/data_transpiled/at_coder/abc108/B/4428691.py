def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.input = sys.stdin
            self.x_1 , self.y_1 = self.input.split ( ' ' )
            self.x_2 , self.y_2 = self.input.split ( ' ' )
            self.height = self.y_2 - self.y_1
            self.width = self.x_2 - self.x_1
            print ( ( self.x_2 - self.height ) , ( self.y_2 + self.width ) , ( self.x_1 - self.height ) , ( self.y_1 + self.width ) )
