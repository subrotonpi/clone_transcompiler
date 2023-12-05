def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
            x = self.sc.randint ( 0 , 60 )
            if x < 60 :
                print ( "Bad" )
            elif x >= 60 and x < 90 :
                print ( "Good" )
            elif x >= 90 and x < 100 :
                print ( "Great" )
            elif x == 100 :
                print ( "Perfect" )
