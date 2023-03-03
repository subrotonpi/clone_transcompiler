def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin.read ( )
        self.output = ""
        for c in self.s :
            if c == "B" :
                if self.output != "" :
                    self.output = self.output [ : - 1 ]
            else :
                self.output += c
        print ( self.output )
