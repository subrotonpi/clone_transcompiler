def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.text = sys.stdin.read ( )
    def main ( self ) :
        self.text = sys.stdin.read ( )
        self.result = [ ]
        for ix in range ( len ( self.text ) ) :
            if self.text [ ix ] == '9' :
                self.result.append ( 1 )
            else :
                self.result.append ( 9 )
        print ( self.result )
