def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.b = sys.stdin.read ( )
        def execute ( self ) :
            self.b = sys.stdin.read ( )
            answer = ""
            if self.b == "A" :
                answer = "T"
            elif self.b == "T" :
                answer = "A"
            elif self.b == "C" :
                answer = "G"
            elif self.b == "G" :
                answer = "C"
            else :
                pass
            print ( answer )
    return Main
