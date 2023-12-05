def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = _main ( )
    def main ( self ) :
        w , a , b = self.sc.split ( )
        print ( max ( max ( b - ( a + w ) , a - ( b + w ) ) , 0 ) )
