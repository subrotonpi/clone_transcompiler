def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
            m = self.sc.recv_match ( type = 'INT' )
            if m == 12 :
                self.print ( 1 )
            else :
                self.print ( m + 1 )
    return Main
