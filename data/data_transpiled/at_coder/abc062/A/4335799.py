def main ( ) :
    import datetime
    from time import month
    from time import sleep
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
        def __call__ ( self ) :
            x , y = self.sc.split ( )
            print ( 'Yes' if Month ( x ).min_length ( ) == Month ( y ).min_length ( ) else 'No' )
    return Main
