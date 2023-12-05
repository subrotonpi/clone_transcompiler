def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.s1 = sys.stdin.readline ( )
            self.s2 = s1.replace ( '1' , '2' )
            self.s3 = s2.replace ( '9' , '1' )
            self.s4 = self.s3.replace ( '2' , '9' )
            print ( int ( self.s4 ) )
