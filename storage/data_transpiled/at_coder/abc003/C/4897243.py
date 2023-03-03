def import _main
class Main ( ) :
    def __init__ ( self , * args , ** kwargs ) :
        s = raw_input ( )
        n , k = s.count ( ) , s.count ( )
        print ( _main ( [ ( s.get ( 'n' ) , ) ] ).sort ( ).pop ( n - k ).reduce ( 0D , ( a , b ) ) )
