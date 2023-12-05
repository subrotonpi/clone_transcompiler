def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
            a = self.sc.readline ( )
            b = self.sc.readline ( )
            c = self.sc.readline ( )
            aa = a.decode ( 'utf-8' )
            ab = b.decode ( 'utf-8' )
            ac = c.decode ( 'utf-8' )
            print ( chr ( aa [ 0 ] - 32 ) , end = ' ' )
            print ( chr ( ab [ 0 ] - 32 ) , end = ' ' )
            print ( chr ( ac [ 0 ] - 32 ) , end = ' ' )
