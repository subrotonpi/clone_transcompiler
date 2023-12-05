def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.Scanner = sys.stdin
        self.N = sys.stdin.read ( )
    def run ( self ) :
        output = ""
        for i in range ( len ( self.N ) ) :
            output_size = len ( output )
            if self.N [ i ] == "B" :
                if output_size > 0 :
                    output = output [ : output_size - 1 ]
            else :
                output = output + self.N [ i ]
        print ( output )
