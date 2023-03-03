def import import sys
class B ( object ) :
    def __init__ ( self ) :
        self.stdin = sys.stdin
        self.T = sys.stdin.read ( )
        for C in range ( 1 , T + 1 ) :
            print ( "Case #%d: %s" % ( C , self.solve ( ) ) )
    def solve ( self ) :
        out = ""
        B = self.B
        M = self.M - 1
        binary = ""
        while M > 0 :
            binary += M % 2
            M = M / 2
        print ( binary , file = sys.stderr )
        if len ( binary ) > B - 2 :
            out = "IMPOSSIBLE"
        else :
            out = "POSSIBLE"
            for i in range ( B ) :
                line = ""
                for j in range ( 0 , i ) :
                    line += "0"
                for j in range ( B - 2 - i ) :
                    line += "1"
                if i < B - 1 :
                    if i == 0 :
                        line += "1"
                    elif i - 1 < len ( binary ) :
                        line += binary [ i - 1 ]
                    else :
                        line += "0"
                out += "\n" + line
        return out
return B
