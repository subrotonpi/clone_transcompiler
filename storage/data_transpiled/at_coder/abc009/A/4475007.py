def main ( ) :
    import math
    class Main ( object ) :
        def __init__ ( self ) :
            self.scn = Scanner ( )
            self.box = scn.input ( )
            self.ans = 0
            self.a = self.box / 2
            self.ans = int ( math.ceil ( self.a ) )
            print ( self.ans )
    return Main
