def _import ( s ) : return int ( s.read ( ) )
class Main :
    def __init__ ( self ) :
        self.s = s
    def getInt ( self ) : return int ( self.s.read ( ) )
    def REPS ( self , r ) : return range ( 0 , r )
    def REPS ( self , l , r ) : return range ( l , r )
    def INTS ( self , l ) : return REPS ( self , l ) ( self , r )
    def main ( self , __ ) :
        a , aa , b , bb = s.split ( ' ' )
        for i in range ( len ( aa ) ) :
            if aa [ i ] != '9' :
                aa [ i ] = '9'
                break
        if bb [ 0 ] == '1' :
            for i in range ( 1 , len ( bb ) ) :
                if bb [ i ] != '0' :
                    bb [ i ] = '0'
                    break
        else :
            bb [ 0 ] = '1'
        print ( max ( miare ( aa ) - miare ( b ) , miare ( a ) - miare ( bb ) ) )
    def miare ( self ) : return int ( str ( self ) )
