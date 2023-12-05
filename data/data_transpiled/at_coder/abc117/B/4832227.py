def main ( args ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.n = int ( sys.stdin.readline ( ).strip ( ) )
            self.l = [ ]
            for i in range ( self.n ) :
                self.l.append ( self.l [ i ] )
        def sort ( self ) :
            self.l = [ ]
            self.sum = 0
            for i in range ( self.n - 1 ) :
                self.sum += self.l [ i ]
            print ( self.l [ self.n - 1 ] < self.sum , end = 'Yes' )
