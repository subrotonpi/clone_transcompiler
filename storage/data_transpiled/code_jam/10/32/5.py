def main ( ) :
    import sys
    class B ( object ) :
        def __init__ ( self ) :
            self.T = len ( sys.stdin )
            for i in range ( T ) :
                L , P , C = self._setup ( )
                print ( "Case #%d: %d\n" % ( i + 1 , calc ( L , P , C ) ) )
    def calc ( min , max , C ) :
        if C ** 2 < C :
            return 0
        if min * C < max :
            return calc ( min , max , ( C ** 2 ) ) + 1
        else :
            return 0
