def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
            D = self.sc.__next__ ( )
            print ( "Christmas" , end = "" )
            while D < 25 :
                print ( " Eve" , end = "" )
                D += 1
            print ( )
