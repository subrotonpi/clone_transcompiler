def import sys , string , traceback , time
class Main ( object ) :
    def __init__ ( self , data ) :
        self.data = data
        self.tag = False
        if self.data [ 0 ] == self.data [ - 1 ] :
            if len ( self.data ) % 2 == 0 :
                print ( "First" )
            else :
                print ( "Second" )
        else :
            if len ( self.data ) % 2 == 0 :
                print ( "Second" )
            else :
                print ( "First" )
