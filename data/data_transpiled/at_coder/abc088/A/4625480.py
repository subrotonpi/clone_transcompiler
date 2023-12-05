def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.scn = sys.stdin
            self.N , self.A = self.scn.read ( ).split ( ' ' )
            print ( 'Yes' if self.A >= ( self.N % 500 ) else 'No' )
