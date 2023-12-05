def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
            self.km = self.sc.value * float ( 0.001 )
        def __repr__ ( self ) :
            return "%s" % self.sc.value
    km = Main ( )
    if km < 0.1 :
        print ( "00" )
    elif km <= 5.0 :
        output = str ( int ( km * 10 ) )
        output = output.split ( " " )
        if len ( output ) == 1 :
            print ( "0" + output )
        else :
            print ( output )
    elif km <= 30.0 :
        print ( int ( km + 50 ) )
    elif km <= 70.0 :
        print ( int ( ( km - 30 ) / 5 + 80 ) )
    else :
        print ( 89 )
