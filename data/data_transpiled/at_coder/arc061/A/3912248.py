def import _main
class ManyFormals ( object ) :
    def __init__ ( self , * argv ) :
        self.many_formals = ManyFormals
    def run ( self ) :
        with open ( self.filename , 'r' ) as sc :
            s = sc.read ( )
        flag = [ ]
        print ( bits ( flag , 0 , s ) )
    def bits ( self , flag , index , s ) :
        if len ( flag ) == index :
            return _Sum ( flag , s )
        else :
            sum = 0
            flag.append ( True )
            sum += bits ( flag , index + 1 , s )
            flag.append ( False )
            sum += bits ( flag , index + 1 , s )
            return sum
    def sum ( self , flag , s ) :
        sum = 0
        start = 0
        for i , v in enumerate ( self.many_formals ) :
            if flag [ i ] :
                sum += int ( s [ start : i + 1 ] )
                start = i + 1
        sum += int ( s [ start : len ( s ) ] )
        return sum
