def import _input
class Main ( object ) :
    def __init__ ( self ) :
        self.h = _input ( )
        self.bmi = _input ( )
    def input ( self ) :
        self.h = _input ( )
        self.bmi = _input ( )
    def main ( self , args ) :
        self.input ( )
        print ( self.bmi * math.pow ( self.h / 100 , 2 ) )
