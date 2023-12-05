def main ( ) :
    import re
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
            input = self.sc.readline ( )
            x = re.split ( '/+' , input )
            print ( '2018/01/' + x [ 2 ] )
