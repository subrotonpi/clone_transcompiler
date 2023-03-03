def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
            sub = self.sc.read ( )
            ten = 0
            for i in range ( sub ) :
                ten += max ( 0 , 80 - self.sc.read ( ) )
            print ( ten )
