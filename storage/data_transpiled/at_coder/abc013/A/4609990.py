def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.x = sys.stdin.read ( )
            self.words = [ 'A' , 'B' , 'C' , 'D' , 'E' ]
            for i in range ( 5 ) :
                if self.x == words [ i ] :
                    print ( i + 1 )
