def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.reader = sys.stdin
            D = self.reader.read ( )
            result = "Christmas"
            while D < 25 :
                result += " Eve"
                D += 1
            sys.stdout.write ( result )
