def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.scn = sys.stdin
            self.month = self.scn.get ( 'month' )
            self.next = None
            if self.month == 12 :
                self.next = 1
            else :
                self.next = self.month + 1
    return Main ( )
