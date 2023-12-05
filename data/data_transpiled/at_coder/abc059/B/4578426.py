def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.a = sys.stdin.read ( )
            self.b = sys.stdin.read ( )
            self.ans = "EQUAL"
            if len ( a ) > len ( b ) :
                self.ans = "GREATER"
            elif len ( a ) < len ( b ) :
                self.ans = "LESS"
            else :
                for ac , bc in zip ( a , b ) :
                    if ac < bc :
                        self.ans = "LESS"
                        break
                    elif ac > bc :
                        self.ans = "GREATER"
                        break
        print ( self.ans )
