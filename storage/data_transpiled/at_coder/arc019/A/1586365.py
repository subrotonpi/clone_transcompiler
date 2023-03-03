def import input
class Main ( object ) :
    def __init__ ( self ) :
        self.s = input ( )
    def __init__ ( self , * args ) :
        self.s = input ( )
    def main ( self ) :
        self.s = input ( )
        for char in self.s :
            if char == 'O' :
                self.s = self.s.replace ( 'O' , '0' )
            elif char == 'D' :
                self.s = self.s.replace ( 'D' , '0' )
            elif char == 'I' :
                self.s = self.s.replace ( 'I' , '1' )
            elif char == 'Z' :
                self.s = self.s.replace ( 'Z' , '2' )
            elif char == 'S' :
                self.s = self.s.replace ( 'S' , '5' )
            elif char == 'B' :
                self.s = self.s.replace ( 'B' , '8' )
            else :
                pass
        print ( self.s )
