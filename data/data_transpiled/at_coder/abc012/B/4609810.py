def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
            self.n = self.sc.number
            print ( self.n / 3600 < 10 , "0" + self.n / 3600 , end = "" )
            print ( ":" , end = "" )
            print ( self.n % 3600 / 60 < 10 , "0" + self.n % 3600 / 60 , end = "" )
            print ( ":" , end = "" )
            print ( self.n % 60 < 10 , "0" + self.n % 60 , end = "" )
